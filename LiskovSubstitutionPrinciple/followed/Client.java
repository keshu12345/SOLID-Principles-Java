package LiskovSubstitutionPrinciple.followed;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static  void main(String []args){
        List<Vehicle>vehicleList=new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        for(Vehicle vehicle:vehicleList){
            System.out.println(vehicle.getNumberOfWheels());
        }
//        If we try engine engine will not be available for Biclcle
//        for(Vehicle vehicle:vehicleList){
//            System.out.println(vehicle.hasEngine());
//        }

    }
}
