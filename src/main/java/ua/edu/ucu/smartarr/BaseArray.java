package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] elements;

    public BaseArray(Object[] elements){
        this.elements = elements.clone();
    }

    @Override
    public Object[] toArray(){
        return this.elements.clone();
    }

    @Override
    public String operationDescription(){
        return "No decorator";
    }

    @Override
    public int size(){
        return this.elements.length;
    }

}
