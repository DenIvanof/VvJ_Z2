public class Main {
    public static void main(String[] args) {
        System.out.println("Пополнение баланса мобильного телефона");
        int x = 100;
        System.out.println("Начальный баланс " + (x) + "руб");
        int y;
        y = 1100;
        System.out.println("Вы внесли на баланс " + (y) + "руб");
        int z;
        if (y <= 1000) {
            z = (x) + (y);
        } else {
            z = (x) + ((y) + ((y) / 100));
        }
        System.out.println("Ваш текущий баланс составляет " + (z) + "руб");
    }
}
