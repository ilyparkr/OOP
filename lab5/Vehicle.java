
public class Vehicle {
    private int fuel;
    private String topspeed;
    protected void setFuel(int i){
        fuel = i;
    }
    protected void setTopSpeed(String n){
        topspeed = n;
    }
    protected int getFuel(){
        return fuel;
    }
    protected String getTopSpeed(){
        return topspeed;
    }
    public void showInfo(){
        System.out.println("Furl is "+fuel+" litre and Top Speed is "+topspeed+" m/s.");
    }
}
