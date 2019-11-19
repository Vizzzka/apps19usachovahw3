package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        Object[] oldArray = this.smartArray.toArray();
        this.elements = Arrays.stream(oldArray).filter(myPredicate).toArray();
    }

    @Override
    public String operationDescription() {
        return "Filter";
    }

}
