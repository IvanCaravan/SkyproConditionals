public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
public static void task1() {
    int age = 18;
        System.out.println("Если возраст человека равен " + age + " то ");

    if (age >= 18) {
        System.out.println("он совершеннолетний");
    }
    else {
        System.out.println("он не достиг совершеннолетия, нужно немного подождать");
    }
}
    public static void task2() {
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        int speed = 61;
            System.out.println("Если скорость " + speed + " то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф.");
        }
        else System.out.println("можно ездить спокойно.");
    }
    public static void task4() {
    int age = 1;
        System.out.println("Если возраст человека равен " + age + " то ");
        if (age >= 2) {
            if (age >= 2 && age <= 6) {
                System.out.println("ему нужно ходить в детский сад.");
            }
            if (age >= 7 && age <= 18) {
                System.out.println("ему нужно ходить в школу.");
            }
            if (age > 18 && age <= 24) {
                System.out.println("его место в университете.");
            }
            else {
                System.out.println("ему пора ходить на работу.");
            }
            }
      /*  else System.out.println("Ему надо сосать титю"); */
    }

    public static void task5() {
        int age = 14;
        System.out.println("Если возраст ребенка равен " + age + " то ему ");
        if (age < 5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        boolean canChildRideWithAdult = age >= 5 && age < 14;
        if (canChildRideWithAdult) {
            String text = "можно кататься на аттракционе в сопровождении взрослого";
            System.out.println(text);
        }
        else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        int totalSpace = 102;
        int seats = 60;
        int seatsTaken = 103; // введите сколько мест занято вообще

        if (seatsTaken < 61) {
        int seatsLeft = seats - seatsTaken;
            System.out.println("В вагоне ещё есть " + seatsLeft + " сидячих и 42 стоячих мест");
        }
        else if (seatsTaken >= 61 && seatsTaken < 102) {
            int standsLeft = totalSpace - seatsTaken;
            System.out.println("В вагоне осталось " + standsLeft + " стоячих мест");
        }
    else System.out.println("Вагон уже полностью забит");
    }
    public static void task7() {
        int one = 5;
        int two = 4;
        int three = 6;
    if (three > two && three > one) {
        System.out.println(three);
    }
    if (two > one && two > three) {
        System.out.println(two);
    }
    if (one > two && one > three) {
        System.out.println(one);
    }
    }
}