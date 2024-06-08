package laba8.IndTask2;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Iterator;

public class ParseJsonBooks {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/laba8/IndTask2/Books.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONObject library = (JSONObject) jsonObject.get("library");
            JSONArray jsonArray = (JSONArray) library.get("books");

            // Поиск книг по автору
            System.out.println("\nКниги автора 'Лев Толстой':");
            String author = "Лев Толстой";
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (author.equals(book.get("author"))) {
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                }
            }


            // Добавление новой книги
            System.out.println("\nДобавление новой книги:");
            JSONObject newBook = new JSONObject();
            newBook.put("title", "Гранатовый браслет");
            newBook.put("author", "Александр Куприн");
            newBook.put("year", 1910);
            System.out.println("Название книги: Гранатовый браслет");
            System.out.println("Автор: Александр Куприн");
            System.out.println("Год издания: 1910");
            jsonArray.add(newBook);

            // Вывод измененного массива
            System.out.println("\nМассив книг после добавления:");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

            // Удаление книги
            System.out.println("\nУдаление книги 'Гранатовый браслет':");
            String title = "Гранатовый браслет";
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                }
            }

            // Вывод измененного массива
            System.out.println("\nМассив книг после удаления:");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}