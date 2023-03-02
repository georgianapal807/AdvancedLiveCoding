package e26;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Data
class Manufacturer {
    private String name;
    private int yearOfCreation;
    private List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }


}