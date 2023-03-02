package e16;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Runner {
    BEGINNER (11, 15),
    INTERMEDIATE(8,10),
    ADVANCED(4,7);

    private final Integer minTimeInMinutes;
    private final Integer maxTimeInMinutes;

    public static Runner getFitnessLevel(Integer time){
      return Arrays.stream(Runner.values())
                .filter(runner -> runner.minTimeInMinutes<= time && runner.maxTimeInMinutes>=time)
                .findFirst()
                .get();
    }

}
