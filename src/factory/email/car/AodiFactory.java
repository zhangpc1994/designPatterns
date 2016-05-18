package factory.email.car;

/**
 * Created by XH on 2016/5/18.
 */
public class AodiFactory implements Factory {
    @Override
    public AodiCar produce() {
        System.out.println("进入奥迪工厂，开始生产奥迪！");
        return new AodiCar();
    }
}
