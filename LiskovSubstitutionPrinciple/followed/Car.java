package LiskovSubstitutionPrinciple.followed;

public class Car extends EngineVehicle{
    @Override
    public int getNumberOfWheels(){
        return 4;
    }
}
