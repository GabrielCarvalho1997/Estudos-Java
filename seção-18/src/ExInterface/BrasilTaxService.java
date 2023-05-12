package ExInterface;

public class BrasilTaxService implements TaxService {

    public double tax(Double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }

    @Override
    public double tax(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'tax'");
    }

}
