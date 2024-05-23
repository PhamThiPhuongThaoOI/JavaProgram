package lap010.strategy.strategy020;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();

        int firstNumber = 5;
        int secondNumber = 34;

        String action = "addition" ;

        if( action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy((new ConcreteStrategySubtract()));
        } else if( action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        int result = context.excuteStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);
    }
}
