public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();

        haveBook = borrowedBook != null;
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "Toi khong co cuon sach";
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
