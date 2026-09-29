class Time {
    int hr;
    int min;
    int seconds;
    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }
    Time(int hr, int min, int seconds) {
        setTime(hr, min, seconds);
    }

    void setTime(int hr, int min, int seconds) {
        if (hr >= 0 && hr < 24)
            this.hr = hr;
        else
            this.hr = 0;

        if (min >= 0 && min < 60)
            this.min = min;
        else
            this.min = 0;

        if (seconds >= 0 && seconds < 60)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }

    void display() {
        System.out.println("Time = " + hr + ":" + min + ":" + seconds);
    }

    public static void main(String[] args) {
        Time t = new Time(10, 30, 45);

        t.display();
    }
}
