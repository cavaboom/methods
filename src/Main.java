
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2022;
        printYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        printOS(clientOS, clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printDeliveryDistance(deliveryDistance);
    }

    public static int printYear(int year) {
        if (year % 4 == 0 && year != 100 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    public static int printOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        return clientOS;
    }
    public static int printDeliveryDistance (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        }
        return deliveryDistance;
    }
}