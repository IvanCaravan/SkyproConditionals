public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
            if (age >= 25) {
                System.out.println("ему пора ходить на работу.");
            }
            }
        else System.out.println("Ему надо сосать титю");
    }



}