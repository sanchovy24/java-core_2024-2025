package laba2.Example6;

    class Circle implements Figures {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * this.radius;
        }
    }


