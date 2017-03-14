package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class TaskLog {

    private int taskLog_id;
    private int taskLog_taskId;
    private int taskLog_manager;
    private String taskLog_time;
    private int taskLog_operation;
    private String taskLog_reason;

    public TaskLog(){}

    public TaskLog(int taskLog_id, int taskLog_taskId, int taskLog_manager, String taskLog_time, int taskLog_operation, String taskLog_reason) {
        this.taskLog_id = taskLog_id;
        this.taskLog_taskId = taskLog_taskId;
        this.taskLog_manager = taskLog_manager;
        this.taskLog_time = taskLog_time;
        this.taskLog_operation = taskLog_operation;
        this.taskLog_reason = taskLog_reason;
    }

    public int getTaskLog_id() {
        return taskLog_id;
    }

    public void setTaskLog_id(int taskLog_id) {
        this.taskLog_id = taskLog_id;
    }

    public int getTaskLog_taskId() {
        return taskLog_taskId;
    }

    public void setTaskLog_taskId(int taskLog_taskId) {
        this.taskLog_taskId = taskLog_taskId;
    }

    public int getTaskLog_manager() {
        return taskLog_manager;
    }

    public void setTaskLog_manager(int taskLog_manager) {
        this.taskLog_manager = taskLog_manager;
    }

    public String getTaskLog_time() {
        return taskLog_time;
    }

    public void setTaskLog_time(String taskLog_time) {
        this.taskLog_time = taskLog_time;
    }

    public int getTaskLog_operation() {
        return taskLog_operation;
    }

    public void setTaskLog_operation(int taskLog_operation) {
        this.taskLog_operation = taskLog_operation;
    }

    public String getTaskLog_reason() {
        return taskLog_reason;
    }

    public void setTaskLog_reason(String taskLog_reason) {
        this.taskLog_reason = taskLog_reason;
    }
}
