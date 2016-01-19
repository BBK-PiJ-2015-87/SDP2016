package decoupledwithfactory;

/**
 * Created by vladimirsivanovs on 19/01/2016.
 */
public class CustomPhraseMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "this is a custom massage!!!";
    }
}
