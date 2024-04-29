package laba5;
import java.util.List;
import java.util.stream.Collectors;
public class IndTask1 {
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

        String substring = "день";
        List<String> stringsAfter = filterStringsBySubstring(strings, substring);

        System.out.println("\nСтроки, содержащие подстроку \"" + substring + "\":");
        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterStringsBySubstring(List<String> list, String substring) {
        return list.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
    }
}
