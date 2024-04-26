import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //задача 1
        task1();
        //Задача 2
        task2();
        //Задача 3
        task3();
    }

    //метод проверки високосности года
    public static void checkLeapYear(int year) {
        if (year < 0) {
            System.out.println("Год не может быть отрицательным");
            return;
        } else if (year >= 0 && year < 1584) {
            System.out.println("Первым високосным годом по Григорианскому календарю был 1584");
            return;
        }
        if (year >= 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    //метод проверки ОС и года
    public static void setupAppVersion(int clientOS, int year) {
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Введите корректную ОС: 0 - iOS, 1 - Android");
            return;
        }
        if (year < 2007 || year > LocalDate.now().getYear()) {
            System.out.println("Год не может быть больше текушего или меньше 2007");
            return;
        }
        String iOS = "Установите версию приложения для iOS по ссылке";
        String android = "Установите версию приложения для Android по ссылке";
        String iOSLite = "Установите облегченную версию приложения для iOS по ссылке";
        String androidLite = "Установите облегченную версию приложения для Android по ссылке";

        if (year < LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println(iOSLite);
            } else System.out.println(androidLite);
        }

        if (year == LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println(iOS);
            } else System.out.println(android);
        }

    }

    //метод измерения дистанции
    public static int calcDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else return 0;
    }

    public static void task1() {
        System.out.println("Задача 1:");
        checkLeapYear(2021);
        System.out.println("");
    }

    public static void task2() {
        System.out.println("Задача 2");
        setupAppVersion(0, 2024);
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        String message = "Потребуется дней: ";
        int distance = calcDistance(95);
        if (distance > 0) {
            switch (distance) {
                case 1:
                    System.out.println(message + 1);
                    break;
                case 2:
                    System.out.println(message + 2);
                    break;
                case 3:
                    System.out.println(message + 3);
                    break;
            }
        } else System.out.println("Свыше 100 км доставки нет");
    }
}