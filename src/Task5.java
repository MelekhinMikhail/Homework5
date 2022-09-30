public class Task5 {
    public static void main(String[] args) {
        int monthNumber = 5;
        if (monthNumber > 12 || monthNumber < 1) {System.out.println("Ошибка! В году всего 12 месяцев!");}
        switch (monthNumber) {
            case (1):
                System.out.println("1-й месяц январь относится к сезону зима");
                break;
            case (2):
                System.out.println("2-й месяц февраль относится к сезону зима");
                break;
            case (3):
                System.out.println("3-й месяц март относится к сезону весна");
                break;
            case (4):
                System.out.println("4-й месяц апрель относится к сезону весна");
                break;
            case (5):
                System.out.println("5-й месяц май относится к сезону весна");
                break;
            case (6):
                System.out.println("6-й месяц июнь относится к сезону лето");
                break;
            case (7):
                System.out.println("7-й месяц июль относится к сезону лето");
                break;
            case (8):
                System.out.println("8-й месяц август относится к сезону лето");
                break;
            case (9):
                System.out.println("9-й месяц сентябрь относится к сезону осень");
                break;
            case (10):
                System.out.println("10-й месяц октябрь относится к сезону осень");
                break;
            case (11):
                System.out.println("11-й месяц ноябрь относится к сезону осень");
                break;
            case (12):
                System.out.println("12-й месяц декабрь относится к сезону зима");
                break;
        }
    }
}
