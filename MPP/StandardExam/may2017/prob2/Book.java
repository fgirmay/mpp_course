package may2017.prob2;

public class Book extends LendingItem {

    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String isbn, String title, String authorFirstName, String authorLastName) {
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof LendingItem)) {
            return false;
        }

        Book book = (Book)obj;

        if (this.isbn.equals(book.isbn)
                && this.title.equals(book.title)
                && this.authorFirstName.equals(book.authorFirstName)
                && this.authorLastName.equals(book.authorLastName)) {
            return true;
        }

        return false;
    }

}
