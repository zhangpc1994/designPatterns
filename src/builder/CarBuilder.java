package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XH on 2016/5/18.
 */
//汽车建造类
public class CarBuilder {
    List<Car> carList = new ArrayList<Car>();

    //需要多少传多少
    public List<Car> aodiBuilder(int count){
        for(int i=0; i<count; i++){
            carList.add(new AodiCar());
        }
        return carList;
    }
    public List<Car> baomaBuilder(int count){
        for(int i=0; i<count; i++){
            carList.add(new BaomaCar());
        }
        return carList;
    }
}
