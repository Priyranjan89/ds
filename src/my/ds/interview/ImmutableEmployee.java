package my.ds.interview;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableEmployee {

    private final int id;
    private final String name;
    private final Map<String, String> address;

    public ImmutableEmployee(int id, String name, Map<String, String> address) {
        this.id = id;
        this.name = name;
        Map<String, String> tempAddress = new HashMap<>();
        for (Map.Entry<String, String> entry : address.entrySet()){
            tempAddress.put(entry.getKey(), entry.getValue());
        }

        this.address = tempAddress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAddress() {

        Map<String, String> tempAddress = new HashMap<>();
        for (Map.Entry<String, String> entry : address.entrySet()){
            tempAddress.put(entry.getKey(), entry.getValue());
        }
        return tempAddress;
    }
}
