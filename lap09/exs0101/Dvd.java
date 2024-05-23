package lap09.exs0101;

public class Dvd extends Item {
    int duration;

    public Dvd ( String title, int year, int duration) {
        super(title,year);
        this.duration = duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "title='" + title + '\'' +
                '}';
    }
}
