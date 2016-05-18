package factory.email.car;

/**
 * Created by XH on 2016/5/18.
 */
public class BaomaFactory implements Factory {
    @Override
    public Car produce() {
        System.out.println("进入宝马工厂，开始生产宝马！");
        return new BaomaCar();
    }
}
