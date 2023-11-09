package LiskovSubstitutionPrinciple.notFollowed;


// This throwing null pointer exception because bicycle dose not have engine
public class Bicycle extends Vehicle{

    @Override
    public Boolean hasEngine() {
        return null;
    }
}
