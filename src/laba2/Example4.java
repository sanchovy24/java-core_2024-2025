package laba2;

public class Example4 {
    enum Gender { // Перечисление для представления пола
        мужской,
        женский
    }
    private String name;
    private int age;
    private Gender gender;


    public Example4(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    //Пример использования созданного класса
    public static void main(String[] args) {
        Example4 person = new Example4("Александра", 22, Gender.женский);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        person.setName("Данил");
        System.out.println("Новое имя: " + person.getName());

        person.setAge(25);
        System.out.println("Новый возраст: " + person.getAge());

        person.setGender(Gender.мужской);
        System.out.println("Новый пол: " + person.getGender());
    }
}

