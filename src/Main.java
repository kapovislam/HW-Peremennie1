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

        var totalHours = 640;
        var hour = 8;
        var employees = totalHours / hour;
        System.out.println("Всего работников в компании – " + employees + " человек");
        var totalEmployees = employees + 94;
        var totalTime = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего "
                + totalTime + " часов работы может быть поделено между сотрудниками");


    }
}