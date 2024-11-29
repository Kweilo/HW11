public class Main {
    //Задание 1
    public static void findYear(int year) {
        if (year < 1584) {
            System.out.println("Год не может быть меньше 1585");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //Задание 2
    public static void findOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию");
        }
    }
    //Задание 3
    public static void findDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        //Задание 1
        int years = 2012;
        findYear(years);

        //Задание 2
        int clientDeviceYear = 2010;
        int clientOS = 0;
        findOS(clientOS,clientDeviceYear);

        //Задания 3
        int deliveryDistance = 95;
        findDistance(deliveryDistance);
    }
}