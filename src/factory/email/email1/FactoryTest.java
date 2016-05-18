package factory.email.email1;

/**
 * Created by XH on 2016/5/18.
 */
public class FactoryTest {
    public static void main(String args[]){
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("email1");
        sender.send();
    }
}
