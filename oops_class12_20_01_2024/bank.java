package oops_class12_20_01_2024;

public class bank {
    private String currency;
    private Integer amount;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }
    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(bank banKName) throws CustomException {
        if (!(banKName.currency.equalsIgnoreCase("USD"))) {
            throw new CustomException("USD to INR not supported!");
//            throw new ArithmeticException("Arthi");
        }
        Integer sum = this.amount + banKName.amount;
        return sum;
    }
}