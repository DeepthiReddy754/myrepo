package SingleTonOne;

public class Singletonnull {

    private static Singletonnull obj = null;

    private Singletonnull() {
        System.out.println("Private Constructor is called");
    }

    public static Singletonnull CreateObj() {
        if (obj == null) {
            obj = new Singletonnull();
        }
        return obj;
    }

    public void display() {
        System.out.println("The Ojecte creation complete");
    }

    public void display1() {
        System.out.println("The second obj creation is comeplete");
    }

    public static void main(String[] args) {
    	Singletonnull st = new Singletonnull();
    	Singletonnull st1 = new Singletonnull();
    	Singletonnull st2 = new Singletonnull();
        // stc.display();
        // stc1.display1();

    }
}