package factory.email.email2.impls;

import factory.email.email2.interfaces.Provider;
import factory.email.email2.interfaces.Sender;

/**
 * Created by Administrator on 2016-05-18.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        System.out.println("进入Sms工厂！");
        return new SmsSender();
    }
}
