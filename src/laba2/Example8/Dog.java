package laba2.Example8;
    class Dog extends Animal {
        private String breed;
        private String food;

        public Dog(String name, int age, String breed, String food) {
            super(name, age);
            this.breed = breed;
            this.food = food;
        }


        // Метод отображающий породу собаки
        public String getBreed() {
            return this.breed;
        }
        public String getFood() {
            return this.food;
        }
        @Override
        public void Sound() {
            System.out.println("Гав-гав");
        }
    }
