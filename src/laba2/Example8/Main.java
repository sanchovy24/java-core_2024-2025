package laba2.Example8;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Гоша", 1, true);
        Cat cat = new Cat("Васька", 3, "куриные ножки");
        Dog dog = new Dog("Жучка", 10, "беспородная", "кости");

        System.out.println("Собака");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Корм: " + dog.getFood());
        dog.Sound();

        System.out.println("\nКошка");
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Корм: " + cat.getFood());
        cat.Sound();

        System.out.println("\nПтица");
        System.out.println("Имя: " + bird.getName());
        System.out.println("Возраст: " + bird.getAge());
        System.out.println("Умеет летать: " + bird.Fly());
        bird.Sound();
    }
}
