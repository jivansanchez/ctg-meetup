package solid.openclosed.withinterfaces;

public class Test {

    public static void main(String[] args) {
        Context context = new Context(new Strategy1()); // we inject the Strategy1
        context.executeTheStrategy();  // it will print “Execute strategy 1”;
        context = new Context(new Strategy2());  // we inject the Strategy2
        context.executeTheStrategy();  // it will print “Execute strategy 2”
    }
}
