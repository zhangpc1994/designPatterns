package factory.email;

/**
 * Created by XH on 2016/5/18.
 */
public class SmsSender implements Sender{
    @Override
    public void send(){
        System.out.println("sms发送！");
    }
}
