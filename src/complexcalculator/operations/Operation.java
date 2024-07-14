package complexcalculator.operations;

import complexcalculator.model.ComplexNumber;

public interface Operation {
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
    String getSymbol();
}