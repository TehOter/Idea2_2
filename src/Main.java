public class Main {
    public static void main(String[] args) {
//вхожные данные
        int balance = 10;
        int amount = 1099;
        int bonus = amount / 100;

//Логика
        if (amount >= 1000) {
            System.out.println(" Ваш Бонус " + (bonus));
            System.out.println(" Ваш Счет " + (balance + amount + bonus));
        } else {
            System.out.println(" Ваш Счет " + (balance + amount));
        }


    }
}