package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();//获取当前时间
        System.out.println(date);
        Date date1 = new Date(1000);//表示指定时间
        System.out.println(date1);
        date1.setTime(2000);
        System.out.println(date1);


        SimpleDateFormat sdf = new SimpleDateFormat();//默认时间格式
        System.out.println(sdf.format(date));

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//指定时间格式
        System.out.println(sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E");//指定时间格式
        System.out.println(sdf2.format(date));

        

    }
}
