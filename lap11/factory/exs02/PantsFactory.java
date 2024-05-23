package lap11.factory.exs02;

public class PantsFactory implements StoreClothesFactory{
    @Override
    public Morden creatMorden() {
        return new PantsMorden();
    }
    @Override
    public Classic creatClassic() {
        return new PantsClassic();
    }
}
