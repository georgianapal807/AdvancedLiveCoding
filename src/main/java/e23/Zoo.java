package e23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    Map<String, Integer> animals = new HashMap<>();

    public void addAnimals(String species, int noOfAnimal) {
//        animals.merge(species, noOfAnimal, Integer::sum); (cu lamda)
        if (animals.get(species) == null) {
            animals.put(species, noOfAnimal);
        } else {
            animals.put(species, animals.get(species) + noOfAnimal);
        }
    }

    public int getNumberOfAllAnimals() {
//        int counter = 0;
//        for (Map.Entry<String, Integer> values : animals.entrySet()) {
//            counter +=animals.get(values);
//        }
//        return counter;
// ------------------------------------------------------------------------
//        return animals.values().stream()
//                .mapToInt(values -> values)
//                .sum();
// ------------------------------------------------------------------------
        return animals.values().stream()
                .reduce(0, Integer::sum);
    }

    public Map<String, Integer> getAnimalsCountSorted(){
        return animals.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((value1, value2) -> (value1-value2)*-1))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
    }

}
