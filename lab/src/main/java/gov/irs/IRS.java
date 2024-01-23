package gov.irs;

import com.hr.personnel.Employee;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0; // for dealing with the array

    public void register(TaxPayer taxPayer) {
        taxPayers[currentIndex] = taxPayer;
        currentIndex++;
    }

    public double computeTotalMonthlyTaxToCollect() {
        double sum = 0.0;
        int count = 0;
        while(count < currentIndex) {
            TaxPayer a = taxPayers[count];
            double val = a.computeMonthlyTaxToPay();
            sum += val;
            count++;
        }
        return sum;
    }

    public TaxPayer[] getTaxPayers() {
        return taxPayers;
    }
}