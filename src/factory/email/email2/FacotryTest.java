package factory.email.email2;

import factory.email.email2.impls.EmailFactory;
import factory.email.email2.interfaces.Provider;
import factory.email.email2.interfaces.Sender;

/**
 * Created by Administrator on 2016-05-18.
 */
public class FacotryTest {
    public static void main(String args[]){
        Provider provider = new EmailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
