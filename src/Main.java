import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Задача 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");

        //Задача 7
        System.out.println("Задача 7");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        var secondWay = secondBoxer % firstBoxer;
        System.out.println("Разница в весе " + secondWay + " кг");

        //Задача 8
        System.out.println("Задача 8");
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