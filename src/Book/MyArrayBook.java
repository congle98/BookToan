package Book;

import java.util.Scanner;

public class MyArrayBook {
    public static Book[] addBook(Book[] books,Book book,Scanner scanner){
        System.out.println("Muốn thêm vào vị trí thứ mấy");
        int index = scanner.nextInt();
        Book[] newBooks = new Book[books.length+1];
        for (int i = 0; i < newBooks.length; i++) {
            if(i==index){
                newBooks[i] = book;
            }
            else if(i>index){
                newBooks[i]= books[i-1];
            }
            else {
                newBooks[i]=books[i];
            }
        }
        return newBooks;
    }
    public static Book[] setBook(Book[] books,Book book,Scanner scanner){
        System.out.println("Muốn sửa ở vị trí thứ mấy");
        int index = scanner.nextInt();
        books[index] = book;
        return books;
    }
    public static Book[] deleteBook(Book[] books){
        System.out.println("Mời nhập tên sách cần xoá");
        String name = new Scanner(System.in).nextLine();
        Book[] newBooks = new Book[books.length-1];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equalsIgnoreCase(name)){
                index=i;
            }
        }
        for (int i = 0; i < newBooks.length; i++) {
            if(i<index){
                newBooks[i]=books[i];
            }
            else if (i>=index){
                newBooks[i]=books[i+1];
            }
        }
        return newBooks;
    }
    public static void showBooks(Book[] newBooks){
        for (Book book:newBooks
             ) {
            System.out.println(book);
        }
    }


}
