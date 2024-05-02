package exam02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Ex10 {
    public static void main(String[] args) {
        int[] scores = { 60, 78, 90, 100, 87 };
        IntSummaryStatistics stat =  Arrays.stream(scores).summaryStatistics(); // 반환값 IntStream이다 // 통계
        double avg = stat.getAverage();
        long count = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();
        long sum = stat.getSum();

        System.out.printf("평균 : %f, 총 갯수 : %d, 최대: %d, 합계: %d%n", avg, count, max, min, sum);
    }
}
