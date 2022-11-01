package onboarding;

public class Problem3 {
    static int numCounter(int curNum){
        int count = 0;
        while(curNum > 1){
            int remainder = curNum % 10;
            if(remainder == 3 || remainder == 6 || remainder == 9){
                count += 1;
            }
            curNum /= 10;
        }
        return count;
    }
    static int clapCounter(int clapNum){
        int count = 0;
        while(clapNum>0){
            count += numCounter(clapNum);
            clapNum -= 1;
        }
        return count;
    }
    public static int solution(int number) {
        int answer = clapCounter(number);
        return answer;
    }
}
