public class Main {
    public static void main(String[] args) {
        System.out.println("Пополнение баланса мобильного телефона");
        int balance = 100;
        System.out.println("Начальный баланс " + (balance) + "руб");
        int money;
        money = 1100;
        System.out.println("Вы внесли на баланс " + (money) + "руб");
        int result;
        if (money <= 1000) {
            result = (balance) + (money);
        } else {
            result = (balance) + ((money) + ((money) / 100));
        }
        System.out.println("Ваш текущий баланс составляет " + (result) + "руб");
    }
}
