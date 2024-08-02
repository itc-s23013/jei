// 学生番号: s23013
// 課題概要: 問６のプログラムをアレンジして実行例のように追加で中央値を求めるようにしてください

import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] arguments) {
        int[] nums = new int[arguments.length];

        int i = 0;
        for (String arg : arguments) {
            nums[i++] = Integer.parseInt(arg);
        }

        Analyzer analyzer = new Analyzer();
        analyzer.setNums(nums);
        System.out.println(analyzer.analyze());
    }
}

class Analyzer {
    int[] nums;

    void setNums(int[] nums) {
        this.nums = nums;
    }

    String analyze() {
        StringBuilder sb = new StringBuilder();

        double avg = getAverage();
        sb.append("平均値: " + avg + "\n");
        int r = getRange();
        sb.append("値の範囲: " + r + "\n");

        int[] counts = getHighLowCounts(avg);
        sb.append("平均より大きい値の個数: " + counts[0] + "\n");
        sb.append("平均より小さい値の個数: " + counts[1] + "\n");

        double median = getMedian();
        sb.append("中央値: " + median + "\n");

        return sb.toString();
    }

    double getAverage() {
        double sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum / nums.length;
    }

    int getRange() {
        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    int[] getHighLowCounts(double avg) {
        int high = 0, low = 0;
        for (int n : nums) {
            if (n > avg) {
                high++;
            } else if (n < avg) {
                low++;
            }
        }
        return new int[]{high, low};
    }

    double getMedian() {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

