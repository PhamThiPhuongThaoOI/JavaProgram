package lap07.ex0106_ex0107;

public class BigDog extends Dog{
    public BigDog( String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooooow");
    }
    public void greets( BigDog another) {
        System.out.println("Woooooooooooooooow");
    }
}
