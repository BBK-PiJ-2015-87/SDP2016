package decoupledwithfactory;

/**
 * Created by vladimirsivanovs on 19/01/2016.
 */
public class CustomMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider = null;
    @Override
    public void render() {
        System.out.println(messageProvider.getMessage().toUpperCase());
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }
}
