package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;
import java.util.Collections;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        Object[] oldArray = this.smartArray.toArray();
        this.elements = Arrays.stream(oldArray).sorted(myComparator).toArray();
    }

    @Override
    public String operationDescription() {
        return "Sort";
    }

}
