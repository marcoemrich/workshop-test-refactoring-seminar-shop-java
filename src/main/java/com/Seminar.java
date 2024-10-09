package com;

public class Seminar {
  private String title;
  private double netPrice;
  private boolean taxFree;

  public Seminar(String title, double netPrice, boolean taxFree) {
      this.title = title;
      this.netPrice = netPrice;
      this.taxFree = taxFree;
  }

  public double getGrossPrice() {
      return getNetPrice() * getTaxRate();
  }

  public double getOriginalNetPrice() {
      return this.netPrice;
  }

  public double getNetPrice() {
      return this.netPrice +
        (this.netPrice > Constants.RESALE_FEE_LIMIT
          ? Constants.UPPER_RESALE_FEE
          : Constants.LOWER_RESALE_FEE);
  }

  public void setNetPrice(double netPrice) {
      this.netPrice = netPrice;
  }

  public double getTaxRate() {
    return this.taxFree ? 1 : Constants.TAX_RATE;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public void setTaxFree(boolean b) {
    this.taxFree = b;
  }

}
