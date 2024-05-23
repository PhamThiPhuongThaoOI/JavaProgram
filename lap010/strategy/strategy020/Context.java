package lap010.strategy.strategy020;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public int  excuteStrategy(int a, int b) {
        return strategy.excute(a,b);
    }
}
