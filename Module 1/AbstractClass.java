abstract class AbstractButtonClass{
    String caption;
    public abstract void buttonPress();

    public void setCaption(String caption){
        this.caption = caption;
    }

    public String getCaption(){
        return this.caption;
    }
}

interface ButtonPress {
    void buttonPress();
}

class SendButtonClass extends AbstractButtonClass{
    String sendTo;
    String message;
    @Override
    public void buttonPress(){
        System.out.println("Sending " + this.message + " to " + this.sendTo);
    }
    public void setSendTo(String sendTo){
        this.sendTo = sendTo;
    }
    public void setMessage(String message){
        this.message = message;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("a@b.com");
        sendButton.setMessage("Hello World");
        sendButton.buttonPress();
    }
}