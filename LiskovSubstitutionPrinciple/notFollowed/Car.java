package LiskovSubstitutionPrinciple.notFollowed;

public class Car extends Vehicle{
    @Override
    public int getNumberOfWheels(){
        return 4;
    }

}
