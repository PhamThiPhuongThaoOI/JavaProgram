package lap11.factory.exs02;

public class Application {
    private StoreClothesFactory store;
    private Classic classic;

    public Application( StoreClothesFactory store) {
        this.store = store;
    }
    public void creatCL() {
        this.classic = store.creatClassic();
    }
    public void size() {
        classic.size();
    }
}
