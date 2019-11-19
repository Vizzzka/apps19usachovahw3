package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.*;

import static org.junit.Assert.*;


public class ArrayDecoratorsTest {
    @Test
    public void testSortDecorator() {
        SmartArray smartArray = new BaseArray(new Integer[] {3, 4, 5, 2, 1});
        MyComparator cmp = new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        };
        Object[] expected = {1, 2, 3, 4, 5};
        Object[] result = (new SortDecorator(smartArray, cmp)).toArray();

        assertArrayEquals(expected, result);

    }

    @Test
    public void testFilterDecorator(){
        SmartArray smartArray = new BaseArray(new Integer[] {3, 4, 5, 2, 1});
        MyPredicate predicate = new MyPredicate() {
            @Override
            public boolean test(Object o) {
                return (Integer) o > 3;
            }
        };
        Object[] expected = {4, 5};
        Object[] result = (new FilterDecorator(smartArray,
                predicate)).toArray();

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMapDecorator(){
        House h1 = new House("Lipetska4", 5555.8),
                h2 = new House("SovkovaStreet96", 1991.0),
                h3 = new House("SovkovaStreet96", 1991.0),
                h4 = new House("RomanukYlitsa100", 10000000.0);

        SmartArray smartArray = new BaseArray(new House[]{h1, h2, h3, h4});
        MyFunction func = new MyFunction() {
            @Override
            public Object apply(Object o) {
                return new House(((House) o).getAddress(), 0.0);
            }
        };
        h1 = new House("Lipetska4", 0.0);
        h2 = new House("SovkovaStreet96", 0.0);
        h3 = new House("SovkovaStreet96", 0.0);
        h4 = new House("RomanukYlitsa100", 0.0);

        Object[] expected = {h1, h2, h3, h4};
        Object[] result = (new MapDecorator(smartArray, func)).toArray();

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDistinctDecorator(){
        House h1 = new House("Lipetska4", 5555.8),
                h2 = new House("SovkovaStreet96", 1991.0),
                h3 = new House("SovkovaStreet96", 1991.0),
                h4 = new House("RomanukYlitsa100", 10000000.0);

        SmartArray smartArray = new BaseArray(new House[] {h1, h2, h3, h4});
        Object[] expected = {h1, h3, h4};
        Object[] result = (new DistinctDecorator(smartArray)).toArray();

        assertArrayEquals(expected, result);

    }

}
