package my.ds.interview.collection;

import java.util.Objects;

public class Emp {

    private String name;
    private String address;

    public Emp(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getString() {
        return address;
    }

    public void setString(String address) {
        this.address = address;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return Objects.equals(getName(), emp.getName()) &&
                Objects.equals(getString(), emp.getString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getString());
    }

    */

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
