// [Bài tập] Xây dựng lớp StopWatch

public class StopWatch {

    // Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
    private long startTime;
    private long stopTime;

    // Constructor không tham số: khởi tạo startTime = thời gian hiện tại
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    // Reset startTime
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Set endTime
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    // Thoi gian trôi qua (ms)
    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
