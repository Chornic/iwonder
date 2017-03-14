package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class Mail {

    private int mail_id;
    private String mail_title;
    private String mail_sender;
    private String mail_receiver;
    private String mail_time;
    private String mail_text;
    private int mail_delete;

    public Mail(){}

    /**
     * 全参数构造
     * @param mail_id
     * @param mail_title
     * @param mail_sender
     * @param mail_receiver
     * @param mail_time
     * @param mail_text
     * @param mail_delete
     */
    public Mail(int mail_id, String mail_title, String mail_sender, String mail_receiver, String mail_time,
                String mail_text, int mail_delete) {
        this.mail_id = mail_id;
        this.mail_title = mail_title;
        this.mail_sender = mail_sender;
        this.mail_receiver = mail_receiver;
        this.mail_time = mail_time;
        this.mail_text = mail_text;
        this.mail_delete = mail_delete;
    }

    public int getMail_id() {
        return mail_id;
    }

    public void setMail_id(int mail_id) {
        this.mail_id = mail_id;
    }

    public String getMail_title() {
        return mail_title;
    }

    public void setMail_title(String mail_title) {
        this.mail_title = mail_title;
    }

    public String getMail_sender() {
        return mail_sender;
    }

    public void setMail_sender(String mail_sender) {
        this.mail_sender = mail_sender;
    }

    public String getMail_receiver() {
        return mail_receiver;
    }

    public void setMail_receiver(String mail_receiver) {
        this.mail_receiver = mail_receiver;
    }

    public String getMail_time() {
        return mail_time;
    }

    public void setMail_time(String mail_time) {
        this.mail_time = mail_time;
    }

    public String getMail_text() {
        return mail_text;
    }

    public void setMail_text(String mail_text) {
        this.mail_text = mail_text;
    }

    public int getMail_delete() {
        return mail_delete;
    }

    public void setMail_delete(int mail_delete) {
        this.mail_delete = mail_delete;
    }



}