
public interface Fly {
    void fly();
}

public interface Walk {
    void walk();
}

public class Hummingbird implements Fly {
    @Override
    public void fly() {
        System.out.println("Hummingbird is flying");
    }
}

public class Sparrow implements Fly, Walk {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    
}
