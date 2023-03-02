package e18e19;

public class Main {
    public static void main(String[] args) {

        Computer computerOne = new Computer("AMD", 512, "gForce", "Intel", "GTFX1000");
        Computer computerTwo = new Computer("Intel", 1024, "gtx", "IBM", "GTFM1000");
        Computer computerThree = new Computer("Intel", 512, "gForce", "Intel", "GTFX1000");
        Computer computerFour = new Computer("AMD", 2048, "Nvidia", "Intel", "GTFX1000");

        System.out.println(computerOne.hashCode());
        System.out.println(computerTwo.equals(computerFour));
        System.out.println(computerThree.toString());

        Laptop laptop = new Laptop("MacBook", 2048, "Nvidia", "IBM", "12332", 100000);
        System.out.println(laptop.toString());

    }
}
