package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SeminarTest {


    @Test
    public void shouldCalculateCorrectGrossPrices() {
        // Seminar: OOP with net price of 700, tax-free: false
        Seminar seminar = new Seminar("OOP", 700, false);
        ThreeLetterDiscount discount = new ThreeLetterDiscount(seminar);

        // Apply discount and check gross price
        discount.apply();
        assertEquals(1044.2131, seminar.getGrossPrice(), 0.0001);

        // Change net price to 300 and check again
        seminar.setNetPrice(300);
        discount.apply();
        assertEquals(373.66, seminar.getGrossPrice(), 0.0001);

        // Set taxFree to true and check
        seminar.setTaxFree(true);
        discount.apply();
        assertEquals(299.75, seminar.getGrossPrice(), 0.0001);

        // Change title to a longer one and check
        seminar.setTitle("Objekt-Orientierte Programmierung");
        discount.apply();
        assertEquals(299.75, seminar.getGrossPrice(), 0.0001);
    }
}
