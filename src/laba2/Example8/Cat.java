package laba2.Example8;

class Cat extends Animal {
    private String food;
    // Методы для наследования
    public Cat(String name, int age, String typeEat) {
        super(name, age);
        this.food = typeEat;
    }

    // Метод отображающий тип питания для кошачих
    public String getFood() {
        return this.food;
    }

    @Override
    public void Sound() {
        System.out.println("Мяу-мяу");
    }

}
