package lap09.exs0101;

public class Book extends Item{
    int pages;

    public Book( String title, int year, int pages) {
        super(title,year);
        this.pages = pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
