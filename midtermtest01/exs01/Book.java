package midtermtest01.exs01;

public class Book implements MyBookComparable {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
    private String publisher;

    private Book(){}

    public static class BookBuilder{
        private String title;
        private String author;
        private String genre;
        private int pages;
        private double price;
        private String publisher;

        public BookBuilder( String title) {
            this.title = title;
        }
        public BookBuilder withAuthor( String author){
            this.author = author;
            return this;
        }
        public BookBuilder withGenre( String genre) {
            this.genre = genre;
            return this;
        }
        public BookBuilder withPages( int pages) {
            this.pages = pages;
            return this;
        }
        public BookBuilder withPrice( double price) {
            this.price = price;
            return this;
        }
        public BookBuilder withPublisher( String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Book build() {
            Book book = new Book();
            book.title = this.title;
            book.author = author;
            book.genre = genre;
            book.pages = pages;
            book.price = price;
            book.publisher = publisher;
            return book;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
    @Override
    public int compareTo( Book another) {
        int genreComparison = this.genre.compareTo(another.genre);
        if( genreComparison !=0) {
            return genreComparison;
        }
        return this.title.compareTo(another.title);
    }
}
