package builder;

import java.util.List;

/**
 * Created by XH on 2016/5/18.
 */
public class BuilderTest {
    public static void main(String args[]){
        CarBuilder carBuilder = new CarBuilder();
        List<Car> carList = carBuilder.aodiBuilder(10);
        for(Car car : carList){
            System.out.println("汽车："+car);
        }
    }
}
