package LiskovSubstitutionPrinciple.notFollowed;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String []args){
        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Bicycle());
        for(Vehicle vehicle:vehicleList){
            System.out.println(vehicle.hasEngine().toString());
        }
    }

}
