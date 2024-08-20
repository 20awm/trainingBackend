package day2.Animal;

class Cat extends Animal {
    private static final String zooDestination = "Taman Safari";
    public class InnerClass {
        public void zooNameTwo() {
            System.out.println(
                    "Kebun Binatang: "
                            + zooDestination);
        }
    }
    public void animalSound() {
        System.out.println(
                "The cat is meowing");
    }
    @Override
    public void animalLegs() {
        super.animalLegs();
        System.out.println("A cat has four legs");
    }
}
