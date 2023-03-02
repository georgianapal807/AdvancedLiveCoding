package e26;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = Car.builder()
                .name("Audi A6")
                .carType(CarType.SEDAN)
                .description("Quattro")
                .build();

        Car car1m = Car.builder()
                .name("Golf 6")
                .carType(CarType.HATCHBACK)
                .description("GTI R-line")
                .build();

        Model m1 = Model.builder()
                .name("Audi")
                .productionStartYear(2001)
                .cars(List.of(car))
                .build();

        Model m2 = Model.builder()
                .name("VW")
                .productionStartYear(2008)
                .cars(List.of(car1m))
                .build();

        Manufacturer manufacturer = Manufacturer.builder()
                .name("VAG")
                .yearOfCreation(1944)
                .models(List.of(m1, m2))
                .build();

        Dealer dealer = new Dealer(List.of(manufacturer));
        System.out.println(dealer.getAllModels());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllCars());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllManufacturersNames());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllManufacturersEstablishmentYear());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllModelNames());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllYearOfProductionStart());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllCarNames());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getAllCarDescriptions());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getCarWithEvenYear());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getCarsWithEvenStartingProductionYearAndOddEstablishingManufacturerYear());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getCabrioCarsWithSpecifiedFilter());
        System.out.println("---------------------------------------------------------------");
        System.out.println(dealer.getSedanCarsWithSpecifiedFilter());
    }
}
