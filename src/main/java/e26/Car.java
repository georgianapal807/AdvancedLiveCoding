package e26;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Car {
    private String name;
    private String description;
    private CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }
}