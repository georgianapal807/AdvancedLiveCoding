package e23;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Tiger", 5);
        zoo.addAnimals("Elephant", 3);
        zoo.addAnimals("Giraffe", 10);
        System.out.println("Total number of all animals in the zoo " + zoo.getNumberOfAllAnimals());
        System.out.println(zoo.getAnimalsCountSorted());
    }
}
