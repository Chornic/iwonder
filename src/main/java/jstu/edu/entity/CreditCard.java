package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class CreditCard {
    private String creditCard_number;
    private String creditCard_userId;
    private String creditCard_bank;
    private String creditCard_addTime;

    public CreditCard(){}

    /**
     * 全参数构造
     * @param creditCard_number
     * @param creditCard_userId
     * @param creditCard_bank
     * @param creditCard_addTime
     */
    public CreditCard(String creditCard_number, String creditCard_userId, String creditCard_bank,
                      String creditCard_addTime) {
        this.creditCard_number = creditCard_number;
        this.creditCard_userId = creditCard_userId;
        this.creditCard_bank = creditCard_bank;
        this.creditCard_addTime = creditCard_addTime;
    }


    public String getCreditCard_number() {
        return creditCard_number;
    }


    public void setCreditCard_number(String creditCard_number) {
        this.creditCard_number = creditCard_number;
    }


    public String getCreditCard_userId() {
        return creditCard_userId;
    }


    public void setCreditCard_userId(String creditCard_userId) {
        this.creditCard_userId = creditCard_userId;
    }


    public String getCreditCard_bank() {
        return creditCard_bank;
    }


    public void setCreditCard_bank(String creditCard_bank) {
        this.creditCard_bank = creditCard_bank;
    }


    public String getCreditCard_addTime() {
        return creditCard_addTime;
    }


    public void setCreditCard_addTime(String creditCard_addTime) {
        this.creditCard_addTime = creditCard_addTime;
    }



}
