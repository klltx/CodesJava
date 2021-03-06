/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.svetashov.time;

/**
 *
 * @author Admin
 */
class Time {
    int sec;
    int min;
    int hour;

    public Time(int sec) {
        if (sec < 0) throw new IllegalArgumentException("Wrong argument");
        this.sec = sec;
        
        while(this.sec >= 3600 * 24) this.sec -= 3600 * 24;
        hour = this.sec / 3600;
        min = (this.sec % 3600) / 60;
        this.sec = (this.sec % 3600) % 60;
    }

    public Time(int sec, int min, int hour) {
        if (hour > 24 || hour < 0 || min > 59 || min < 0 || sec > 59 || sec < 0) throw new IllegalArgumentException("Incorrect time");
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int showHour() {
        return hour;
    }

    public int showMin() {
        return min;
    }

    public int showSec() {
        return sec;
    }

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
    
}
