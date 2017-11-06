package java100.app.domain;

public class Room {
    protected String loication;
    protected String name;
    protected int capacity;
    
    public Room(){}
    
    public Room(String location,String name, int capacity){
        this.loication = location;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room [loication=" + loication + ", name=" + name + ", capacity=" + capacity + "]";
    }

    public String getLoication() {
        return loication;
    }

    public void setLoication(String loication) {
        this.loication = loication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
