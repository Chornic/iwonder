package jstu.edu.entity;

/**
 * Created by 张 磊 on 2017/3/13.
 */
public class Task {
    private int task_id;
    private String task_sender;
    private int task_accepters;
    private double task_salary;
    private String task_title;
    private String task_startTime;
    private String task_endTime;
    private String task_text;
    private int task_state;
    private int task_levelCondition;
    private int task_creditCondition;
    private String task_timeCondition;

    public Task(){}

    /**
     * 全参数构造函数
     * @param task_id
     * @param task_sender
     * @param task_accepters
     * @param task_salary
     * @param task_title
     * @param task_startTime
     * @param task_endTime
     * @param task_text
     * @param task_state
     * @param task_levelCondition
     * @param task_creditCondition
     * @param task_timeCondition
     */
    public Task(int task_id, String task_sender, int task_accepters, double task_salary, String task_title,
                String task_startTime, String task_endTime, String task_text, int task_state, int task_levelCondition,
                int task_creditCondition, String task_timeCondition) {
        this.task_id = task_id;
        this.task_sender = task_sender;
        this.task_accepters = task_accepters;
        this.task_salary = task_salary;
        this.task_title = task_title;
        this.task_startTime = task_startTime;
        this.task_endTime = task_endTime;
        this.task_text = task_text;
        this.task_state = task_state;
        this.task_levelCondition = task_levelCondition;
        this.task_creditCondition = task_creditCondition;
        this.task_timeCondition = task_timeCondition;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_sender() {
        return task_sender;
    }

    public void setTask_sender(String task_sender) {
        this.task_sender = task_sender;
    }

    public int getTask_accepters() {
        return task_accepters;
    }

    public void setTask_accepters(int task_accepters) {
        this.task_accepters = task_accepters;
    }

    public double getTask_salary() {
        return task_salary;
    }

    public void setTask_salary(double task_salary) {
        this.task_salary = task_salary;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTask_startTime() {
        return task_startTime;
    }

    public void setTask_startTime(String task_startTime) {
        this.task_startTime = task_startTime;
    }

    public String getTask_endTime() {
        return task_endTime;
    }

    public void setTask_endTime(String task_endTime) {
        this.task_endTime = task_endTime;
    }

    public String getTask_text() {
        return task_text;
    }

    public void setTask_text(String task_text) {
        this.task_text = task_text;
    }

    public int getTask_state() {
        return task_state;
    }

    public void setTask_state(int task_state) {
        this.task_state = task_state;
    }

    public int getTask_levelCondition() {
        return task_levelCondition;
    }

    public void setTask_levelCondition(int task_levelCondition) {
        this.task_levelCondition = task_levelCondition;
    }

    public int getTask_creditCondition() {
        return task_creditCondition;
    }

    public void setTask_creditCondition(int task_creditCondition) {
        this.task_creditCondition = task_creditCondition;
    }

    public String getTask_timeCondition() {
        return task_timeCondition;
    }

    public void setTask_timeCondition(String task_timeCondition) {
        this.task_timeCondition = task_timeCondition;
    }



}