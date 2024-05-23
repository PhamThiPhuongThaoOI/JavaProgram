package lap010.strategy.strategy030;

public class ContextSort {
   private StrategySort strategy;

   public ContextSort( StrategySort strategy) {this.strategy = strategy;
   }

    public void setStrategy(StrategySort strategy) {
        this.strategy = strategy;
    }
    public int[] sort(int[] arr){
       return strategy.sort(arr);
    }
}