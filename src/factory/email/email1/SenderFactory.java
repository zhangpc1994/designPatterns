package factory.email.email1;

/**
 * Created by XH on 2016/5/18.
 */
public class SenderFactory {
    public Sender produce(String type){
        if("sms".equals(type)){
            return new SmsSender();
        }else if("email1".equals(type)){
            return new EmailSender();
        }else {
            System.out.println("请输入正确类型！");
            return null;
        }
    }
}
