package solid.liskovsubstitution.sample1;

public class Ostrich extends Bird {

    public void fly(){
        throw new UnsupportedOperationException();
    }
}
