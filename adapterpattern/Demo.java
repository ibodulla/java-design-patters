package design.patterns.adapterpattern;

/**
 * Ibodulla Ibodullaev created on 3/12/2020 inside the package - design.patterns.adapterpattern
 */
public class Demo {

    public static void main(String[] args) {
        // Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("1684213556846584");
        xpay.setCustomerName("Ibodullaev Ibodulla");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)138);
        xpay.setAmount(5324.75);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }

}