
    public class LiveBox extends Box {
        private String animal;
        private int age;

        public LiveBox(){
            animal = "";
            age = 0;
        }

        public LiveBox(String dA, String rA, double w, double l, double h, int c, String animal, int age){
            super(dA, rA, w, l, h, c);
            this.animal = animal;
            this.age = age;
        }

        public String getAnimal(){
            return animal;
        }

        public int getAge(){
            return age;
        }

        @Override
        public String toString(){
            return getId() + "\n" + getDeliveryAddress() + "\n" + getReturnAddress()
                    + "\n" + getWidth() + "x" + getLength() + "x" + getHeight() + "\nAnimal: " + getAnimal()
                    + "\nCount: " + getCount() + "\nAge (Days): " + getAge();
        }

    }

