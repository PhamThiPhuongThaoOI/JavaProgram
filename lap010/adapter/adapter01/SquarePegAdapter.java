package lap010.adapter.adapter01;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0); // Khởi tạo với bán kính 0, vì không cần sử dụng
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        // Adapter giả vờ là một hình tròn có bán kính có thể chứa hình vuông
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
