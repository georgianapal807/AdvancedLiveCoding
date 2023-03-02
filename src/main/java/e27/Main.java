package e27;

public class Main {
    public static void main(String[] args) {

        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("Alexandru", "Alexandra", "Ana"));


    }
}
