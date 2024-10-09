package com;

public class ThreeLetterDiscount {
    private Seminar seminar;

    public ThreeLetterDiscount(Seminar seminar) {
        this.seminar = seminar;
    }

    public void apply() {
        this.seminar.setNetPrice(this.seminar.getOriginalNetPrice() - discount());
    }

    public boolean isGranted() {
        return this.seminar.getTitle().length() <= 3;
    }

    public double discount() {
        return this.seminar.getOriginalNetPrice() * discountRate();
    }

    public double discountRate() {
        return !isGranted() ? 0 : Constants.THREE_LETTER_DISCOUNT_RATE / 100;
    }
}
