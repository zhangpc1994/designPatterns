package factory.email.email2.impls;

import factory.email.email2.interfaces.Sender;

/**
 * Created by Administrator on 2016-05-18.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms方式发送！");
    }
}
