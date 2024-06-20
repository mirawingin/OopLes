package Lesson1;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры горячих напитков
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Чай", 250, 75);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 200, 85);
        HotDrinkWithTemperature hotChocolate = new HotDrinkWithTemperature("Горячий шоколад", 300, 80);

        // Создаем автомат и добавляем в него напитки
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(coffee);
        vendingMachine.addProduct(hotChocolate);

        // Получаем продукт из автомата по имени и объему
        HotDrink product1 = vendingMachine.getProduct("Кофе", 200);
        if (product1 != null) {
            System.out.println("Вы получили: " + product1);
        } else {
            System.out.println("Продукт не найден.");
        }

        // Получаем продукт из автомата по имени, объему и температуре
        HotDrinkWithTemperature product2 = vendingMachine.getProduct("Горячий шоколад", 300, 80);
        if (product2 != null) {
            System.out.println("Вы получили: " + product2);
        } else {
            System.out.println("Продукт не найден.");
        }
    }
}
