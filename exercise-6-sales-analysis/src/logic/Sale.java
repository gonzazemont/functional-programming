package logic;

public class Sale {
    private double amount;
    private String category;

    public Sale(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}
