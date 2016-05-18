package factory.email.email1;

/**
 * Created by XH on 2016/5/18.
 */
public class EmailSender implements Sender {
    @Override
    public void send(){
        System.out.println("email发送！");
    }
}
