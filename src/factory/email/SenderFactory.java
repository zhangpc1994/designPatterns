package factory.email;

/**
 * Created by XH on 2016/5/18.
 */
public class SenderFactory {
    public Sender produce(String type){
        if("sms".equals(type)){
            return new SmsSender();
        }else if("email".equals(type)){
            return new EmailSender();
        }else {
            System.out.println("请输入正确类型！");
            return null;
        }
    }
}
