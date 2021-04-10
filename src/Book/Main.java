package Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("01","javaBook1",1000,"cong","java","code");
        books[1] = new ProgrammingBook("02","javaBook2",1200,"toan","java","code");
        books[2] = new ProgrammingBook("03","javaBook3",1350,"hoang","java","code");
        books[3] = new ProgrammingBook("04","pythonBoo1",1700,"ha","python","code");
        books[4] = new ProgrammingBook("05","pythonBook2",1500,"tung","python","code");
        books[5] = new FictionBook("11","soccer1",1400,"tien","sport");
        books[6] = new FictionBook("12","soccer2",1600,"quang","sport");
        books[7] = new FictionBook("13","run1",2000,"thang","sport");
        books[8] = new FictionBook("14","gym1",2200,"trung","sport");
        books[9] = new FictionBook("15","gymr1",2500,"quoc","sport");
        Book book = new FictionBook("16","gymr1",2500,"quoc","sport");
        Book newBooks[] = books;


        while (true){
            System.out.println("Mời nhập các lựa chọn sau");
            System.out.println("1. addBook \n 2.setBook \n 3.deleteBook \n 4.showBooks \n 5.Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    newBooks=MyArrayBook.addBook(books,book,scanner);
                    break;
                case 2:
                    newBooks=MyArrayBook.setBook(books,book,scanner);
                    break;
                case 3:
                    newBooks=MyArrayBook.deleteBook(books);
                    break;
                case 4:
                    MyArrayBook.showBooks(newBooks);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}

