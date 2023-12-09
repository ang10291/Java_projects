public final class Book {
    private final String name;
    private final String author;
    private final int pagesCount;
    private final int dateISBN;

    public Book(String name, String author, int pagesCount, int dateISBN) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
        this.dateISBN = dateISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getDateISBN() {
        return dateISBN;
    }
}
