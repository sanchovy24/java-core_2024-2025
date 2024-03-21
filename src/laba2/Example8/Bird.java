package laba2.Example8;

    class Bird extends Animal {
        private boolean fly;
        // Наследуемые методы
        public Bird (String name, int age, boolean fly) {
            super(name, age);
            this.fly = fly;
        }

        // Метод полета у птиц
        public boolean Fly() {
            return this.fly;
        }
        @Override
        public void Sound() {
            System.out.println("Чирик-чирик");
        }
}
