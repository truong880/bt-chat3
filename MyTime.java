

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    // Constructor
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Setters with validation
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Methods to update time
    public MyTime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (++hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (--second == -1) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (--minute == -1) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (--hour == -1) {
            hour = 23;
        }
        return this;
    }
}