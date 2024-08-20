package day2.Animal;

public class MainAnimal {
    private static final String zooDestination = "Ragunan";
    public class InnerClass {
        public void zooName() {
            System.out.println("Kebun Binatang: " + zooDestination);
        }
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.animalLegs();
        myCat.sleep();

        Cat.InnerClass innerObjTwo = myCat.new InnerClass();
        innerObjTwo.zooNameTwo();

        MainAnimal mainAnimal = new MainAnimal();
        MainAnimal.InnerClass innerObj = mainAnimal.new InnerClass();
        innerObj.zooName();


    }
}
