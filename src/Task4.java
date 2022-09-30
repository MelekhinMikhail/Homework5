public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 9;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 ) {
            System.out.println("Потребуется дней: " + (((deliveryDistance - 20) / 40) + 2));
        } else {System.out.println("Ошибка! Дистанция не может быть отрицательной.");}
    }
}
