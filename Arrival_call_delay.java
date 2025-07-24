/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Arrival_call_delay {
    public int from;
    public int to;
    public int length;         
    public int hours; 
    public int min;
    public int sec;
    public Arrival_call_delay(int from, int to, int length, int hours,int min,int sec) {
        this.from = from;
        this.to = to;
        this.length = length;
        this.hours = hours;
        this.min=min;
        this.sec=sec;
        
    }
    public String getFormattedArrivalTime() {
        return String.format("%02d:%02d:%02d", hours, min, sec);
    }
    public int getArrivalTimeInSeconds() {
        return hours * 3600 + min * 60 + sec;
    }
    public String getFormattedLength() {
        int h = length / 3600;
        int m = (length % 3600) / 60;
        int s = length % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
