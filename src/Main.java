public class Main {
    public static void main(String[] args) {
        var testNum = 0;
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeightSum = boxer1Weight + boxer2Weight;
        System.out.println(boxersWeightSum);
        var boxersWeightDifference = boxer1Weight - boxer2Weight;
        System.out.println(boxersWeightDifference);
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        boxersWeightDifference = boxer2Weight - boxer1Weight;
        System.out.println(boxersWeightDifference);
        boxersWeightDifference = boxer2Weight % boxer1Weight;
        System.out.println(boxersWeightDifference);
        testNum = testNum + 1;
        System.out.println("Задача " + testNum);
        var hoursSum = 640;
        var hours = 8;
        var employees = hoursSum / hours;
        System.out.println("Всего работников в компании - " + employees + " человек");
        employees = employees + 94;
        hoursSum = hours * employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + hoursSum + " часов работы может быть поделено между сотрудниками");
    }
}