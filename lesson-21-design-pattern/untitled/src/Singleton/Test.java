package Singleton;

public class Test {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println(bookBorrower1.getAuthorAndTile());

        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTile());

        bookBorrower1.returnBook();
        System.out.println("bookBorrower1 return the book");
        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTile());
    }
}
