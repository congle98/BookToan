package Book;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    public  Book[] books;

    public Manager() {

    }
    public Manager(Book[] books){
        this.books = books;
        menu();
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Mời nhập lựa chọn");
            System.out.println("1.Tính tổng tiền các cuốn sách trong mảng \n" +
                    " 2.Đếm số sách ProgrammingBook có language là \"java\" \n 3. Xắp xếp \n 4. Hiện mảng sách \n 5.Exit ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    getSumAmount();
                    break;
                case 2:
                    countBookJava();
                    break;
                case 3:
                    sortBooks();
                    break;
                case 4:
                    getArrayBooks();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public void getSumAmount(){
        int sum=0;
        for (Book book:books) {
            sum+= book.getPrice() ;
        }
        System.out.println("Tổng tiền tất cả các quyển sách trong mảng là : "+sum);;
    }
    public void countBookJava(){
        int count=0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] instanceof ProgrammingBook&&((ProgrammingBook) books[i]).getLanguage()=="java"){
                    count++;
            }
        }
        System.out.println("Có "+count+" quyển sách thuộc ProgrammingBook có language là java!!");
    }
    public void sortBooks(){
        Book temp;
        for (int i = 0; i < books.length-1; i++) {
            for (int j = i+1; j < books.length; j++) {
                if(books[i].getPrice()>books[j].getPrice()){
                    temp = books[i];
                    books[i]=books[j];
                    books[j]=temp;
                }
            }

        }
    }

    public void getArrayBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
