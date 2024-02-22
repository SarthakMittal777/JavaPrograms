interface Frontend {
    void displayFrontend();
}

interface Backend {
    void displayBackend();
}

class SoftwareDeveloper implements Frontend, Backend {

    public void displayFrontend() {
        System.out.println("I code in React");
    }


    public void displayBackend() {
        System.out.println("I code in Django");
    }
}

public class sarthak_sde_interface {
    public static void main(String[] args) {
        SoftwareDeveloper dev = new SoftwareDeveloper();
        dev.displayFrontend();
        dev.displayBackend();
    }
}
