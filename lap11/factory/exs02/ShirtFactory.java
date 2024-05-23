package lap11.factory.exs02;

public class ShirtFactory implements StoreClothesFactory{
    @Override
    public Morden creatMorden() {
        return new ShirtMorden();
    }
    @Override
    public Classic creatClassic() {
        return new ShirtClassic();
    }
}
