package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        Object[] oldArray = this.smartArray.toArray();
        this.elements = Arrays.stream(oldArray).map(myFunction).toArray();
    }

    @Override
    public String operationDescription() {
        return "Map";
    }

}
