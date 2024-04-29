package laba5;
import java.util.List;
import java.util.stream.Collectors;
public class IndTask3 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Мой дядя самых честных правил,",
                "Когда не в шутку занемог,",
                "Он уважать себя заставил",
                "И лучше выдумать не мог.",
                "Его пример другим наука;",
                "Но, боже мой, какая скука",
                "С больным сидеть и день и ночь,",
                "Не отходя ни шагу прочь!"
        );

        System.out.println("Исходный список строк:");
        for (String s : strings) {
            System.out.println(s);
        }

        int minLength = 30; // задается длина строки
        List<String> stringsFiltered = filterStringsByLength(strings, minLength);

        System.out.println("\nСтроки, длина которых больше " + minLength + ":");
        for (String s : stringsFiltered) {
            System.out.println(s);
        }
    }

    public static List<String> filterStringsByLength(List<String> list, int minLength) {
        return list.stream().filter(s -> s.length() > minLength).collect(Collectors.toList());
    }
}
