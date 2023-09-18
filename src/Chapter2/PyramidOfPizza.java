package Chapter2;

public class PyramidOfPizza {
    public static void main(String[] args) {
        double estimatedNumberOfStonesUsed =2_300_000;

        int averageWightOfEachStone = 3;
        int numberOfYearsTaken = 20;

        double year = estimatedNumberOfStonesUsed / numberOfYearsTaken * averageWightOfEachStone;
        double hour = year / numberOfYearsTaken * averageWightOfEachStone;
        double minute = hour /numberOfYearsTaken * averageWightOfEachStone;

        System.out.println("Weight of pyramid that was built each year: " + year);
        System.out.println("Weight of pyramid that was built each hour: " + hour);
        System.out.println("Weight of pyramid that was built each minute: " + minute);

    }
}
