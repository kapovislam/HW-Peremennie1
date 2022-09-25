public class Main {
    public static void main(String[] args) {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");

        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        var secondWay = secondBoxer % firstBoxer;
        System.out.println("Разница в весе " + secondWay + " кг");


    }
}