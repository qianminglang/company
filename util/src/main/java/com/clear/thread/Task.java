package com.clear.thread;

/**
 * ClassName Task
 *
 * @author qml
 * Date 2021/1/20 15:43
 * Version 1.0
 **/

public class Task {
    private int times;
    private String wordToCopy;

    public Task(int times, String wordToCopy) {
        this.times = times;
        this.wordToCopy = wordToCopy;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getWordToCopy() {
        return wordToCopy;
    }

    public void setWordToCopy(String wordToCopy) {
        this.wordToCopy = wordToCopy;
    }

    public int getLeftCopyCount() {
        return --times;
    }
}