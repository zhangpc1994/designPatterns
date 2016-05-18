package factory.email.car;

/**
 * Created by XH on 2016/5/18.
 */
public class CarTest {
    public static void main(String args[]){
        Factory factory = new DazhongFactory();
        Car car = factory.produce();
        car.drive();
    }
}
