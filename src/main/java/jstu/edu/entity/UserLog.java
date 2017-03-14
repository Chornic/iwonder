package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class UserLog {

    private int userLog_id;
    private int userLog_manager;
    private int userLog_user;
    private String userLog_time;
    private int userLog_opertation;
    private String userLog_reason;

    public UserLog(){}

    /**
     * 全参数构造
     * @param userLog_id
     * @param userLog_manager
     * @param userLog_user
     * @param userLog_time
     * @param userLog_opertation
     * @param userLog_reason
     */
    public UserLog(int userLog_id, int userLog_manager, int userLog_user, String userLog_time, int userLog_opertation, String userLog_reason) {
        this.userLog_id = userLog_id;
        this.userLog_manager = userLog_manager;
        this.userLog_user = userLog_user;
        this.userLog_time = userLog_time;
        this.userLog_opertation = userLog_opertation;
        this.userLog_reason = userLog_reason;
    }

    public int getUserLog_id() {
        return userLog_id;
    }

    public void setUserLog_id(int userLog_id) {
        this.userLog_id = userLog_id;
    }

    public int getUserLog_manager() {
        return userLog_manager;
    }

    public void setUserLog_manager(int userLog_manager) {
        this.userLog_manager = userLog_manager;
    }

    public int getUserLog_user() {
        return userLog_user;
    }

    public void setUserLog_user(int userLog_user) {
        this.userLog_user = userLog_user;
    }

    public String getUserLog_time() {
        return userLog_time;
    }

    public void setUserLog_time(String userLog_time) {
        this.userLog_time = userLog_time;
    }

    public int getUserLog_opertation() {
        return userLog_opertation;
    }

    public void setUserLog_opertation(int userLog_opertation) {
        this.userLog_opertation = userLog_opertation;
    }

    public String getUserLog_reason() {
        return userLog_reason;
    }

    public void setUserLog_reason(String userLog_reason) {
        this.userLog_reason = userLog_reason;
    }
}
