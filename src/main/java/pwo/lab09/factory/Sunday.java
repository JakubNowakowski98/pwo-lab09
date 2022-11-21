package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Niedzielny wypoczynek idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Drugi dzień odpoczynku w tym tygodniu minął";
    }
}
