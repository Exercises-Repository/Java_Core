package exercise;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static int[] randomArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int numberOfElement = in.nextInt();

        int[] arr = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "Thời gian bắt đầu=" + startTime +
                ", thời gian kết thúc=" + endTime +
                '}';
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        // bắt đầu
        stopWatch.start();
        int[] arr = randomArray();
        //kết thúc
        stopWatch.stop();

        System.out.println("Thời gian quá trình: " + stopWatch.getElapsedTime() + "ms");
    }
}
