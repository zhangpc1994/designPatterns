package factory.email.car;

/**
 * Created by XH on 2016/5/18.
 */
public class DazhongFactory implements Factory {
    @Override
    public Car produce() {
        System.out.println("进入大众工厂，开始生产大众！");
        return new DazhongCar();
    }
}
