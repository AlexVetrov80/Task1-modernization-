public class Main {
    public static void main(String[] args) {

        int score = 1;//счет клиента (начальные данные).
        int depositAccount = 40; //депозитный счет клиента -счет для накопления бонусных средств.

        int bonus;

        if (depositAccount > 20) {
            bonus = depositAccount / 20;//формула подсчета бонусных рублей за каждые доп внесенные 20р на депозит.
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");

    }
}