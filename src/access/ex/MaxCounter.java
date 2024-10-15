package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int maxCount) {
        count = 0;
        max = maxCount;
    }

    public void increment() {
        if (isCountValid()) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isCountValid() {
        return count >= max;
    }
}
