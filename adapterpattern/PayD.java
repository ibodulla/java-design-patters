package design.patterns.adapterpattern;

/**
 * Ibodulla Ibodullaev created on 3/12/2020 inside the package - design.patterns.adapterpattern
 */
public interface PayD {

    String getCustCardNo();

    String getCardOwnerName();

    String getCardExpMonthDate();

    Integer getCVVNo();

    Double getTotalAmount();

    void setCustCardNo(String custCardNo);

    void setCardOwnerName(String cardOwnerName);

    void setCardExpMonthDate(String cardExpMonthDate);

    void setCVVNo(Integer cVVNo);

    void setTotalAmount(Double totalAmount);

}
