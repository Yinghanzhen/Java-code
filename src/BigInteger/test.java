package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger(10,new Random());//获取随机大整数
        System.out.println(b1);
        BigInteger b2 = new BigInteger("111651346115616654656546");//获取指定大整数，只能整数
        System.out.println(b2);
        BigInteger b3 =  BigInteger.valueOf(12);//获取-16~16
        BigInteger b4 =  BigInteger.valueOf(12);
        BigInteger b5=b3.add(b4);//加法
        System.out.println(b5);
        BigInteger[] b6 = b4.divideAndRemainder(b1);//获取商和余数
        System.out.println(b6[0]);
        System.out.println(b6[1]);

    }
}