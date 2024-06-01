package laba7;
import java.io.*;
import java.util.Scanner;

class Book implements Serializable {
    private String title;
    private String author;
    private int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
}
public class IndTask8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = in.nextLine();
        System.out.println("Введите автора книги: ");
        String author = in.nextLine();
        System.out.println("Введите количество страниц: ");
        int pages = in.nextInt();
        in.nextLine();
        System.out.println("Введите путь к файлу: ");
        String filePath = in.nextLine();
        System.out.println("Введите имя файла: ");
        String fileName = in.nextLine();
        in.close();

        Book book = new Book(title, author, pages);
        String fullFilePath = filePath + fileName + ".json";

        try{
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(fullFilePath));
            out.writeObject(book);
            System.out.println("Объект сериализован и записан в файл: " + fullFilePath);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream(fullFilePath));
            Book restoredBook = (Book) input.readObject();
            System.out.println("Объект восстановлен из файла:" + fullFilePath);
            if (restoredBook != null) {
                System.out.println("Данные из файла: ");
                System.out.println("Название книги: " + restoredBook.getTitle());
                System.out.println("Автор книги: " + restoredBook.getAuthor());
                System.out.println("Количество страниц: " + restoredBook.getPages());
            }
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
