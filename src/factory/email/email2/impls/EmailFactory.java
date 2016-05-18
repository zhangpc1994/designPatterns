package factory.email.email2.impls;

import factory.email.email2.interfaces.Provider;
import factory.email.email2.interfaces.Sender;

/**
 * Created by Administrator on 2016-05-18.
 */
public class EmailFactory implements Provider{
    @Override
    public Sender produce() {
        System.out.println("进入Email工厂！");
        return new EmailSender();
    }
}
