package opps;

public class Book {
    static int totalBook;

    int id;
    String title;
    String author;
    boolean isBorrowed;



    static {
        totalBook=0;
    }

    {
        totalBook++;
    }
    Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    Book(int id){
        this(id,"unknown","unknown");
    }


    static int getTotalBook(){
        return totalBook;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("you have borrowed a book");
        }

    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Book Returned");
        }else {
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {
        Book book=new Book(1,"Learn OOPS","Ajay");

        Book book1=new Book(2,"Learn Java","Ajay1");

        System.out.println(Book.getTotalBook());
        System.out.println(book1.title);

        book.borrowBook();
        book.returnBook();


        int a=10;
        System.out.println(a);
    }
}
