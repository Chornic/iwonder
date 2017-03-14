package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class User {
    private String user_id;
    private String user_name;
    private String user_icon;
    private String user_sex;
    private int user_level;
    private int user_socre;
    private int user_credit;
    private double user_balance;
    private String user_tel;
    private String user_mail;
    private int user_webMailNumber;
    private int user_dealingTaskNumber;
    private int user_publishingTaskNumber;
    private String user_QQ;
    private String user_major;
    private int user_creditCardNumber;
    private String user_selfDescribe;
    private int user_acceptTaskNumber;
    private int user_publishTaskNumber;
    private int user_freeze;

    public User(){}

    /**
     * 全参数构造
     * @param user_id
     * @param user_name
     * @param user_icon
     * @param user_sex
     * @param user_level
     * @param user_socre
     * @param user_credit
     * @param user_balance
     * @param user_tel
     * @param user_mail
     * @param user_webMailNumber
     * @param user_dealingTaskNumber
     * @param user_publishingTaskNumber
     * @param user_QQ
     * @param user_major
     * @param user_creditCardNumber
     * @param user_selfDescribe
     * @param user_acceptTaskNumber
     * @param user_publishTaskNumber
     * @param user_freeze
     */
    public User(String user_id, String user_name, String user_icon, String user_sex, int user_level, int user_socre,
                int user_credit, double user_balance, String user_tel, String user_mail, int user_webMailNumber,
                int user_dealingTaskNumber, int user_publishingTaskNumber, String user_QQ, String user_major,
                int user_creditCardNumber, String user_selfDescribe, int user_acceptTaskNumber, int user_publishTaskNumber,
                int user_freeze) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_icon = user_icon;
        this.user_sex = user_sex;
        this.user_level = user_level;
        this.user_socre = user_socre;
        this.user_credit = user_credit;
        this.user_balance = user_balance;
        this.user_tel = user_tel;
        this.user_mail = user_mail;
        this.user_webMailNumber = user_webMailNumber;
        this.user_dealingTaskNumber = user_dealingTaskNumber;
        this.user_publishingTaskNumber = user_publishingTaskNumber;
        this.user_QQ = user_QQ;
        this.user_major = user_major;
        this.user_creditCardNumber = user_creditCardNumber;
        this.user_selfDescribe = user_selfDescribe;
        this.user_acceptTaskNumber = user_acceptTaskNumber;
        this.user_publishTaskNumber = user_publishTaskNumber;
        this.user_freeze = user_freeze;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_level() {
        return user_level;
    }

    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }

    public int getUser_socre() {
        return user_socre;
    }

    public void setUser_socre(int user_socre) {
        this.user_socre = user_socre;
    }

    public int getUser_credit() {
        return user_credit;
    }

    public void setUser_credit(int user_credit) {
        this.user_credit = user_credit;
    }

    public double getUser_balance() {
        return user_balance;
    }

    public void setUser_balance(double user_balance) {
        this.user_balance = user_balance;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public int getUser_webMailNumber() {
        return user_webMailNumber;
    }

    public void setUser_webMailNumber(int user_webMailNumber) {
        this.user_webMailNumber = user_webMailNumber;
    }

    public int getUser_dealingTaskNumber() {
        return user_dealingTaskNumber;
    }

    public void setUser_dealingTaskNumber(int user_dealingTaskNumber) {
        this.user_dealingTaskNumber = user_dealingTaskNumber;
    }

    public int getUser_publishingTaskNumber() {
        return user_publishingTaskNumber;
    }

    public void setUser_publishingTaskNumber(int user_publishingTaskNumber) {
        this.user_publishingTaskNumber = user_publishingTaskNumber;
    }

    public String getUser_QQ() {
        return user_QQ;
    }

    public void setUser_QQ(String user_QQ) {
        this.user_QQ = user_QQ;
    }

    public String getUser_major() {
        return user_major;
    }

    public void setUser_major(String user_major) {
        this.user_major = user_major;
    }

    public int getUser_creditCardNumber() {
        return user_creditCardNumber;
    }

    public void setUser_creditCardNumber(int user_creditCardNumber) {
        this.user_creditCardNumber = user_creditCardNumber;
    }

    public String getUser_selfDescribe() {
        return user_selfDescribe;
    }

    public void setUser_selfDescribe(String user_selfDescribe) {
        this.user_selfDescribe = user_selfDescribe;
    }

    public int getUser_acceptTaskNumber() {
        return user_acceptTaskNumber;
    }

    public void setUser_acceptTaskNumber(int user_acceptTaskNumber) {
        this.user_acceptTaskNumber = user_acceptTaskNumber;
    }

    public int getUser_publishTaskNumber() {
        return user_publishTaskNumber;
    }

    public void setUser_publishTaskNumber(int user_publishTaskNumber) {
        this.user_publishTaskNumber = user_publishTaskNumber;
    }

    public int getUser_freeze() {
        return user_freeze;
    }

    public void setUser_freeze(int user_freeze) {
        this.user_freeze = user_freeze;
    }



}