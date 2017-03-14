package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class Accept {

    private int accept_taskId;
    private String accept_user;
    private int accept_ifUpload;
    private String accept_answerPath;
    private int accept_downloadTimes;

    public Accept(){}

    /**
     * 全参数构造
     * @param accept_taskId
     * @param accept_user
     * @param accept_ifUpload
     * @param accept_answerPath
     * @param accept_downloadTimes
     */

    public Accept(int accept_taskId, String accept_user, int accept_ifUpload, String accept_answerPath, int accept_downloadTimes) {
        this.accept_taskId = accept_taskId;
        this.accept_user = accept_user;
        this.accept_ifUpload = accept_ifUpload;
        this.accept_answerPath = accept_answerPath;
        this.accept_downloadTimes = accept_downloadTimes;
    }

    public int getAccept_taskId() {
        return accept_taskId;
    }

    public void setAccept_taskId(int accept_taskId) {
        this.accept_taskId = accept_taskId;
    }

    public String getAccept_user() {
        return accept_user;
    }

    public void setAccept_user(String accept_user) {
        this.accept_user = accept_user;
    }

    public int getAccept_ifUpload() {
        return accept_ifUpload;
    }

    public void setAccept_ifUpload(int accept_ifUpload) {
        this.accept_ifUpload = accept_ifUpload;
    }

    public String getAccept_answerPath() {
        return accept_answerPath;
    }

    public void setAccept_answerPath(String accept_answerPath) {
        this.accept_answerPath = accept_answerPath;
    }

    public int getAccept_downloadTimes() {
        return accept_downloadTimes;
    }

    public void setAccept_downloadTimes(int accept_downloadTimes) {
        this.accept_downloadTimes = accept_downloadTimes;
    }
}
