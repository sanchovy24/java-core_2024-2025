package laba2.Example8;

public class Animal {
    private String name;
    private int age;
    // Конструктор для создания объектов класса Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Метод для отображения имя животного
    public String getName() {
        return this.name;
    }
    // Метод для отображения возраста животного
    public int getAge() {
        return this.age;
    }
    // Метод отображающий звук, издаваемого животным
    public void Sound() {
        System.out.println("Звук у животного: ");
    }

}
