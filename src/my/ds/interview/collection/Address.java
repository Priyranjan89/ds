package my.ds.interview.collection;

import java.util.List;
import java.util.Objects;

public class Address {

    private String city;
    private List<Integer> phoneNumber;

    public Address(String city, List<Integer> phoneNumber) {
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getPhoneNumber(), address.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getPhoneNumber());
    }
}
