package Singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null){
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorAndTile(){
        if (haveBook){
            return borrowedBook.getAuthorAndTile();
        }
        return "We don't have that book for you!!!";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
