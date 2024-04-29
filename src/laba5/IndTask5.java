package laba5;
import java.util.List;
import java.util.stream.Collectors;
public class IndTask5 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Мой дядя самых честных правил",
                "Когда не в шутку занемог,",
                "Он уважать себя заставил33"
        );

        System.out.println("Исходный список строк:");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> filteredStrings = filterStringsByLettersOnly(strings);

        System.out.println("\nСтроки, содержащие только буквы без цифр и символов:");
        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }

    public static List<String> filterStringsByLettersOnly(List<String> list) {
        return list.stream().filter(s -> s.matches("[а-яА-ЯёЁ\\s]+")).collect(Collectors.toList());
    }
}
