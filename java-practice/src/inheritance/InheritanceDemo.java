package inheritance;


public class InheritanceDemo extends BMW {

    public InheritanceDemo(int speed) {
        super(speed);
    }

    public void increaseSpeedInInheritaceDemo() {
        System.out.println("Increasing Speed of Cars of InheritanceDemo");
    }

    public static void main(String[] args) {

      //  int speed = 10;
        // child class object
        InheritanceDemo obj = new InheritanceDemo(10);
        obj.increaseSpeedInInheritaceDemo();//child class method
        obj.headupDisplayNavigation();// BMW class method
        obj.increaseSpeed();// Cars(super class) method
        obj.decreaseSpeed();//9



    }

}
