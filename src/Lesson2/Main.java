package Lesson2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Actor actor1 = new Actor("Иван", new FoodProduct("Яблоко"));
        Actor actor2 = new Actor("Мария", new DrinkProduct("Кофе"));
        Actor actor3 = new Actor("Алексей", new FoodProduct("Булочка"));

        market.enterMarket(actor1);
        market.enterMarket(actor2);
        market.enterMarket(actor3);

        market.addPersonToQueue(actor1);
        market.addPersonToQueue(actor2);
        market.addPersonToQueue(actor3);

        // Обновляем состояние магазина несколько раз для демонстрации
        market.update();
        market.update();
        market.update();
    }
}
