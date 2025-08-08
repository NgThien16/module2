package ss4_oop;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime; // milliseconds
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }
}
