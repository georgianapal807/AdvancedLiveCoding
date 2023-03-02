package e26;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data

public class Dealer {
    private List<Manufacturer> manufacturerList;

    public List<Model> getAllModels() { //a list of all models
        return manufacturerList.stream()
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars() { //a list of all cars
        return getAllModels().stream()
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<String> getAllManufacturersNames() {
        return manufacturerList.stream()
                .map(Manufacturer::getName)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllManufacturersEstablishmentYear() {
        return manufacturerList.stream()
                .map(Manufacturer::getYearOfCreation)
                .collect(Collectors.toList());
    }

    public List<String> getAllModelNames() {
        return getAllModels().stream()
                .map(Model::getName)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllYearOfProductionStart() {
        return getAllModels().stream()
                .map(Model::getProductionStartYear)
                .collect(Collectors.toList());
    }

    public List<String> getAllCarNames() {
        return getAllCars().stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllCarDescriptions() {
        return getAllCars().stream()
                .map(Car::getDescription)
                .collect(Collectors.toList());
    }

    public List<Car> getCarWithEvenYear() {
        return getManufacturerList().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithEvenStartingProductionYearAndOddEstablishingManufacturerYear() {
        return getManufacturerList().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 1)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(car -> car.getProductionStartYear() % 2 == 0)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getCabrioCarsWithSpecifiedFilter() {
        return getManufacturerList().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(car -> car.getProductionStartYear() % 2 == 1)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .filter(car -> car.getCarType().equals(CarType.CABRIO))
                .collect(Collectors.toList());
    }

    public List<Car> getSedanCarsWithSpecifiedFilter() {
        return getManufacturerList().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() < 1919)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(car -> car.getProductionStartYear() > 2019)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .filter(car -> car.getCarType().equals(CarType.SEDAN))
                .collect(Collectors.toList());
    }




}
