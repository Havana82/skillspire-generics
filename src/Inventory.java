import java.util.ArrayList;

public class Inventory<T extends Vehicle>{
    private ArrayList<T> inventory = new ArrayList<>();

    Inventory( ArrayList<T> inventory ){
        this.inventory = inventory;
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(T vehicle){
        inventory.add(vehicle);
    }

    public void removeFromInventory(String vin){
        for(T v: inventory){
            if(v.vin.equals(vin) ){
                inventory.remove(v);
            }
        }
    }
}
