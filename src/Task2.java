public class Task2 {
    public static void main(String[] args) {
        boolean clientOS = false;
        int clientDeviceYear = 2008;
        if (clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            if (clientOS) {System.out.println("Установите версию приложения для Android по ссылке");}
            else {System.out.println("Установите версию приложения для iOS по ссылке");}
        } else if (clientDeviceYear < 2015) {
            if (clientOS) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        } else {
            System.out.println("Ошибка! Сейчас же 2022 год.");
        }

    }
}
