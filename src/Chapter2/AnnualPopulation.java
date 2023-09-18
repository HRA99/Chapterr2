package Chapter2;

public class AnnualPopulation {
    public static void main(String[] args) {

        double worldPopulationToday = 45.1;
        double growthRate = 2.0;
        double worldPopulationThisYear = 0;
        int years = 5;
        int current = 2023;

        for (int i = 1; i < years;){
            worldPopulationToday *= growthRate;
            worldPopulationThisYear += worldPopulationToday;
            current++;
            i++;
        }

        System.out.println(years);
    }
}
