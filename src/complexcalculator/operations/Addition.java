package complexcalculator.operations;

import complexcalculator.model.ComplexNumber;

public class Addition implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getReal() + b.getReal(),
                a.getImaginary() + b.getImaginary()
        );
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}
