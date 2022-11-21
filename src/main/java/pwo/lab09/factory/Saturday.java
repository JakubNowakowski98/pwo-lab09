package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Sobotni wypoczynek idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Pierwszy dzień odpoczynku w tym tygodniu minął";
    }
}
