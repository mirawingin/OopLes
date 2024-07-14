package complexcalculator.calculator;

import complexcalculator.model.ComplexNumber;
import complexcalculator.operations.Operation;
import complexcalculator.logging.Logger;

public class ComplexCalculator {
    private Operation operation;
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Операция не задана");
        }
        ComplexNumber result = operation.execute(a, b);
        logger.log("Вычисление: " + a + " " + operation.getSymbol() + " " + b + " = " + result);
        return result;
    }
}
