package complexcalculator.view;

import complexcalculator.model.ComplexNumber;
import complexcalculator.operations.Operation;

import java.util.Map;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcome() {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел!");
    }

    public ComplexNumber readComplexNumber() {
        System.out.println("Выберите способ ввода комплексного числа:");
        System.out.println("1. В форме a + bi");
        System.out.println("2. Отдельный ввод действительной и мнимой частей");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.print("Введите комплексное число (например, 3+2i или 3-2i): ");
            return ComplexNumber.fromString(scanner.nextLine());
        } else {
            System.out.print("Действительная часть: ");
            double real = Double.parseDouble(scanner.nextLine());
            System.out.print("Мнимая часть (без 'i'): ");
            double imaginary = Double.parseDouble(scanner.nextLine());
            return new ComplexNumber(real, imaginary);
        }
    }

    public String readOperation(Map<String, Operation> operations) {
        System.out.println("Доступные операции:");
        for (String symbol : operations.keySet()) {
            System.out.println(symbol);
        }
        System.out.print("Выберите операцию: ");
        return scanner.nextLine();
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Результат: " + result);
    }

    public boolean askToContinue() {
        System.out.print("Хотите выполнить еще одну операцию? (да/нет): ");
        return scanner.nextLine().toLowerCase().startsWith("д");
    }
}
