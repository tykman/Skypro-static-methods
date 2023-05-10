
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
            System.out.println("Задача 1");
            int year2021 = 2021;
            int year2024 = 2024;
            printYearType(year2021);
            printYearType(year2024);
        }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public static void printYearType(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " " + "- год високосный");
        } else {
            System.out.println(year + " " + "- год невисокосный");
        }
    }

    public static void task2() {
        System.out.println("=== === === ===");
        System.out.println("Задача 2");
        int os = 1;
        int clientDeviceYear = 2015;
        printInfoMessage(os, clientDeviceYear);
    }

    public static void printInfoMessage(int os, int clientDeviceYear) {
        String message = getInfoMessage(os, clientDeviceYear);
        System.out.println(message);
    }

    public static String getInfoMessage(int os, int clientDeviceYear) {
        if (os == 0 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (os == 1 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else if (os == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (os == 1 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Не удалось определить версию приложения";
        }
    }

    public static void task3 () {
        System.out.println("=== === === ===");
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        String message;
        if (deliveryDays != -1) {
            message = String.format("Потребуется дней: %S", deliveryDays);
        } else {
            message = "Доставки нет";
        }
        System.out.println(message);
    }

    public static Integer calculateDeliveryDays(int deliveryDistance)  {
         if (deliveryDistance < 20 ) {
             return 1;
         } else if (deliveryDistance <= 60) {
             return 2;
         } else if (deliveryDistance < 100) {
             return 3;
         } else {
             return -1;
         }
    }
}