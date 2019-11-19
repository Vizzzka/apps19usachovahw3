package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {
    protected Object[] elements;
    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return this.elements.clone();
    }

    @Override
    public int size() {
        return this.elements.length;
    }

}
