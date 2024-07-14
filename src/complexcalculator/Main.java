package complexcalculator;

import complexcalculator.calculator.ComplexCalculator;
import complexcalculator.logging.Logger;
import complexcalculator.model.ComplexNumber;
import complexcalculator.service.CalculatorService;
import complexcalculator.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ComplexCalculator calculator = new ComplexCalculator(logger);
        CalculatorService service = new CalculatorService(calculator);
        ConsoleView view = new ConsoleView();

        view.displayWelcome();

        do {
            ComplexNumber a = view.readComplexNumber();
            ComplexNumber b = view.readComplexNumber();
            String operation = view.readOperation(service.getOperations());

            try {
                ComplexNumber result = service.performOperation(a, b, operation);
                view.displayResult(result);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } while (view.askToContinue());

        System.out.println("Спасибо за использование калькулятора комплексных чисел!");
    }
}
