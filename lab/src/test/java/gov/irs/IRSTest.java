package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IRSTest {
    private TaxPayer hourly;
    private TaxPayer salary;
    private TaxPayer corp;
    private IRS gubment;

    @BeforeEach
    void setUp() {
        hourly = new HourlyEmployee("Andy", LocalDate.of(2020, 1, 1),
                100, 100);

        salary = new SalariedEmployee("Mai", LocalDate.of(2021, 2, 13),
                10000);

        corp = new Corporation("Mac.inc", 10000);

        gubment = new IRS();
        gubment.register(hourly);
        gubment.register(salary);
        gubment.register(corp);
    }

    @Test
    void computeTotalMonthlyTaxToCollect_shouldReturnTaxToCollect() {
        assertEquals(6500.0, gubment.computeTotalMonthlyTaxToCollect(), .01);
    }
}