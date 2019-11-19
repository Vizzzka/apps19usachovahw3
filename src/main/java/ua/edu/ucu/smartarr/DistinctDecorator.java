package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        Object[] oldArray = this.smartArray.toArray();
        this.elements = Arrays.stream(oldArray).distinct().toArray();
    }

    @Override
    public String operationDescription() {
        return "Distinct";
    }

}
