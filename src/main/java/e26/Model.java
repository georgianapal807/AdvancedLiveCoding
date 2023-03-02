package e26;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
class Model {
    private String name;
    private int productionStartYear;
    private List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }
}