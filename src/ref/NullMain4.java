package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);

        //NullPointerException 발생 시 null 값에 .(dot)을 찍었다고 생각하면 문제를 찾기 쉽다.
    }
}
