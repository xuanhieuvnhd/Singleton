public class Main {
    public static void main(String[] args) {
        System.out.println("Bat dau kiem tra mau");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("Nguoi thu nhat muon sach");
        System.out.println("Tieu de va ten tac gia: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());


        bookBorrower2.borrowBook();
        System.out.println("Nguoi thu hai muon sach");
        System.out.println("Tieu de va ten tac gia: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("Nguoi thu nhat da tra lai sach");

        bookBorrower2.borrowBook();
        System.out.println("Nguoi thu hai muon cuon sach: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("Ket thuc kiem tra mau");
    }
}
