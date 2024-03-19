package laba2.Example6;

   class Square implements Figures {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return Math.pow(this.side, 2);
        }

        @Override
        public double getPerimeter() {
            return 4 * this.side;
        }
    }

