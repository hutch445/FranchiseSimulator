import java.util.Random;
public class RandomAPIWrapper {

    public static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("Random: " + userRandom(5));
        System.out.println("Min and Max: " + minAndMax(5, 10));
        System.out.println("Random String: " + randomString(9));
        System.out.println("Random Alpha String: " + randomAlphaString(9));
        System.out.println("Random Numeric String : " + randomNumericString(9));
    }
    public static int userRandom(int n) {
        int userRandomInt = random.nextInt(n);
        return userRandomInt;
    }
    public static int minAndMax(int min, int max) {
        int minAndMaxInt = random.nextInt(max-min)+min;
        return minAndMaxInt;
    }
    public static String randomString(int length) {
        String randomString = "";
        for (int i = 0; i < length; i++){
            int randomNum = random.nextInt(127-32)+32;
            randomString = randomString + (char) randomNum;
        }
        return randomString;
    }
    public static String randomAlphaString(int length){
        String randomAlphaString = "";
        for (int i = 0; i < length; i = i +2){
            int randomNum1 = random.nextInt(90-65)+65;
            int randomNum2 = random.nextInt(122-97)+97;
            randomAlphaString = randomAlphaString + (char) randomNum1;
            randomAlphaString = randomAlphaString + (char) randomNum2;
        }
        return randomAlphaString;
    }
    public static String randomNumericString(int length){
        String randomNumericString = "";
        for (int i = 0; i < length; i++){
            int randomNumber = random.nextInt(57-48)+48;
            randomNumericString = randomNumericString + (char) randomNumber;
        }
        return randomNumericString;
    }
}
