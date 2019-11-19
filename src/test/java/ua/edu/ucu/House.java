package ua.edu.ucu;

public class House {

    private String address;
    private Double price;

    public House(String address, Double price){
        this.address = address;
        this.price = price;
    }

    public String getAddress(){return this.address;}

    public Double getPrice(){return this.price;}

    @Override
    public boolean equals(Object o){
        if (!(o instanceof House))
            return false;
        return ((House)o).getAddress().equals(this.address) &&
                ((House)o).getPrice().equals(this.price);
    }

    @Override
    public int hashCode(){
        return address.hashCode() + price.hashCode();
    }

}
