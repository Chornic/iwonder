package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class UserLock {
    private String lock_userId;
    private String lock_managerId;
    private String lock_timeBegin;
    private String lock_timeEnd;
    private String lock_reason;

    public UserLock(){}

    /**
     * 全参数构造
     * @param lock_userId
     * @param lock_managerId
     * @param lock_timeBegin
     * @param lock_timeEnd
     * @param lock_reason
     */
    public UserLock(String lock_userId, String lock_managerId, String lock_timeBegin, String lock_timeEnd,
                    String lock_reason) {
        this.lock_userId = lock_userId;
        this.lock_managerId = lock_managerId;
        this.lock_timeBegin = lock_timeBegin;
        this.lock_timeEnd = lock_timeEnd;
        this.lock_reason = lock_reason;
    }

    public String getLock_userId() {
        return lock_userId;
    }

    public void setLock_userId(String lock_userId) {
        this.lock_userId = lock_userId;
    }

    public String getLock_managerId() {
        return lock_managerId;
    }

    public void setLock_managerId(String lock_managerId) {
        this.lock_managerId = lock_managerId;
    }

    public String getLock_timeBegin() {
        return lock_timeBegin;
    }

    public void setLock_timeBegin(String lock_timeBegin) {
        this.lock_timeBegin = lock_timeBegin;
    }

    public String getLock_timeEnd() {
        return lock_timeEnd;
    }

    public void setLock_timeEnd(String lock_timeEnd) {
        this.lock_timeEnd = lock_timeEnd;
    }

    public String getLock_reason() {
        return lock_reason;
    }

    public void setLock_reason(String lock_reason) {
        this.lock_reason = lock_reason;
    }




}

