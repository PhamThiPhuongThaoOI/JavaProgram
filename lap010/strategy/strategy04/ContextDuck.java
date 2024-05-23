package lap010.strategy.strategy04;

public class ContextDuck {
    private Duck duck;
    public ContextDuck( Duck duck) {
        this.duck = duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }
    public String sounding( String chirp) {
        return duck.sounding(chirp);
    }
}
