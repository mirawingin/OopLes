package complexcalculator.service;

import complexcalculator.calculator.ComplexCalculator;
import complexcalculator.model.ComplexNumber;
import complexcalculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorService {
    private ComplexCalculator calculator;
    private Map<String, Operation> operations;

    public CalculatorService(ComplexCalculator calculator) {
        this.calculator = calculator;
        this.operations = new HashMap<>();
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public ComplexNumber performOperation(ComplexNumber a, ComplexNumber b, String operationSymbol) {
        Operation operation = operations.get(operationSymbol);
        if (operation == null) {
            throw new IllegalArgumentException("Неподдерживаемая операция: " + operationSymbol);
        }
        calculator.setOperation(operation);
        return calculator.calculate(a, b);
    }

    public Map<String, Operation> getOperations() {
        return operations;
    }
}
