package kdevelop.entities;

import java.util.List;

public class Hotel {
    private String id;
    private String name;
    private double pricePerNight;
    private Address address;
    private List<Review> reviewList;

    public Hotel() {
    }

    public Hotel(String name, double pricePerNight, Address address, List<Review> reviewList) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address = address;
        this.reviewList = reviewList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @Override
    public String toString() {
        return String.format(" The hotel %S, the price is %d, the address is %s", name, pricePerNight, address);
    }
}
