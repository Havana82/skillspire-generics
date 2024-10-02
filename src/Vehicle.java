public abstract class Vehicle {
    String Make = "Ford";
    String vin;
    int horsepower;

    Vehicle(String vin, int horsepower){
        this.vin = vin;
        this.horsepower = horsepower;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
