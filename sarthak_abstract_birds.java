interface Fly {
    void fly();
}

interface Walk {
    void walk();
}

class FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }

    public void walk() {
        System.out.println("Walking");
    }
}

class FlyingOnlyBird implements Fly {
    public void fly() {
        System.out.println("Flying");
    }
}

class WalkingOnlyBird implements Walk {
    public void walk() {
        System.out.println("Walking");
    }
}

public class sarthak_abstract_birds {
    public static void main(String[] args) {
        FlyingBird hummingbird = new FlyingBird();
        hummingbird.fly();
        hummingbird.walk();

        FlyingOnlyBird sparrow = new FlyingOnlyBird();
        sparrow.fly();

        WalkingOnlyBird penguin = new WalkingOnlyBird();
        penguin.walk();
    }
}
