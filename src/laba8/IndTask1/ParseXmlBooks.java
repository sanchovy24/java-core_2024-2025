package laba8.IndTask1;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class ParseXmlBooks {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/laba8/IndTask1/Books.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания : " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }

            // Добавление новой книги
            System.out.println("\nДобавление книги Гранатовый браслет");



            // Запись измененного XML-файла
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/laba8/IndTask1/Books.xml"));
            transformer.transform(source, result);

            // Поиск книг по автору
            System.out.println("\nКниги автора 'Лев Толстой':");
            NodeList books = doc.getElementsByTagName("book");
            for (int i = 0; i < books.getLength(); i++) {
                Node bookNode = books.item(i);
                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;
                    String author = bookElement.getElementsByTagName("author").item(0).getTextContent();
                    if (author.equals("Лев Толстой")) {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + bookElement.getElementsByTagName("title").item(0).getTextContent());
                        System.out.println("Автор: " + bookElement.getElementsByTagName("author").item(0).getTextContent());
                        System.out.println("Год издания : " + bookElement.getElementsByTagName("year").item(0).getTextContent());
                    }
                }
            }

            // Поиск книг по году издания
            System.out.println("\nКниги года издания '1869':");
            for (int i = 0; i < books.getLength(); i++) {
                Node bookNode = books.item(i);
                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;
                    String year = bookElement.getElementsByTagName("year").item(0).getTextContent();
                    if (year.equals("1869")) {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + bookElement.getElementsByTagName("title").item(0).getTextContent());
                        System.out.println("Автор: " + bookElement.getElementsByTagName("author").item(0).getTextContent());
                        System.out.println("Год издания : " + bookElement.getElementsByTagName("year").item(0).getTextContent());
                    }
                }
            }

            // Удаление книги
            System.out.println("\nУдаление книги 'Гранатовый браслет':");
            NodeList bookNodes = doc.getElementsByTagName("book");
            for (int i = 0; i < bookNodes.getLength(); i++) {
                Node bookNode = bookNodes.item(i);
                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;
                    String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                    if (title.equals("Новая книга")) {
                        Node parentNode = bookElement.getParentNode();
                        parentNode.removeChild(bookElement);
                    }
                }
            }

            // Запись измененного XML-файла
            transformer = TransformerFactory.newInstance().newTransformer();
            source = new DOMSource(doc);
            result = new StreamResult(new File("src/laba8/example1/example.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
