package Classes;

import java.awt.Color;

public class Pickup extends Car implements iRefueling{

    @Override
    public void fuel(){

    }

    private int loadCapacity;

    public Pickup(String make, 
                    String model, 
                    Color color, 
                    TypeCar bodyType, 
                    int numberWheels, 
                    TypeFuel fuel,
                    TypeGearbox gearbox, 
                    float engineCap,
                    int loadCapacity) {
        super(make, model, color, bodyType, numberWheels, fuel, gearbox, engineCap);
        this.loadCapacity = loadCapacity;
        //TODO Auto-generated constructor stub
    }

    @Override
    public int gearShift(int gear) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    
}
