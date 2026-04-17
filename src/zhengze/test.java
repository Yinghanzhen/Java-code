package zhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String a = "c";
        System.out.println(a.matches("[abcdef]"));
        System.out.println("bc".matches("[abcd][abcd]"));//只能一个一个判断
        System.out.println("hello".matches("....."));
        System.out.println("hello".matches("......"));
        System.out.println("3".matches("\\d"));
        System.out.println("330".matches("\\w{3}"));
        System.out.println("3343718027".matches("\\d{5,11}"));
        System.out.println("116bcvb%15___".matches("\\w{4,16}"));
        System.out.println("33022720030818537x".matches("[1-9]\\d{16}[Xx\\d]"));//身份证判断


        String c = "(?i)abc";//忽略abc的大小写
        System.out.println("abC".matches(c));




        //爬虫
        String s = "浙江工商大学kjfbfjkfg浙江理工大学265165浙江财经大学bjhbgjhbg浙江师范大学GBKDSJGB浙江农林大学zjbgz浙江药科职业大学" +
                "jdfd浙江工业大学11111浙江大学，我好帅浙江水利水电学院浙江外国语学院hhhhhhhhhh哈哈哈哈哈哈哈浙江万里学院66666";
        Pattern p = Pattern.compile("浙江(\\W{0,4})(大学|学院)");//获取正则表达式对象
        Matcher m = p.matcher(s);//获取文本匹配器对象，用m读取s，找到符合p的字串
        while (m.find()) {//m.find()：从文本头开始读取，若有符合，返回true，否者返回false
            System.out.println(m.group());//m.group()根据find()找到的索引进行截取
        }


        String s1 = "JavasggfgfdgdfJava8gsdfgJava11 fgsgJava17 ";
        Pattern p1 = Pattern.compile("Java(?=8|11|17)");//?理解为前面的Java，=表示后面要跟随的数据，但最终只获取前半部分
        Matcher m1 = p1.matcher(s1);
        while (m1.find()) {
            System.out.println(m1.group());
        }


        //贪婪爬取    尽可能多的获取数据
        String s2  ="abbbbbbbbbbbb12346";
        Pattern p2 = Pattern.compile("ab+");
        Matcher m2 = p2.matcher(s2);
        while (m2.find()) {
            System.out.println(m2.group());
        }
        //非贪婪爬取   尽可能少的获取数据
        Pattern p3 = Pattern.compile("ab+?");
        Matcher m3 = p3.matcher(s2);
        while (m3.find()) {
            System.out.println(m3.group());
        }


        String s3 = "林提议fgsdfgdsflintilevs翁凌云fgdg林提了";
        String s4 = s3.replaceAll("\\w+", "vs");//把s3符合规则的内容替换为vs
        System.out.println(s4);

        String[] split = s3.split("\\w+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


        System.out.println("a123a".matches("(.).+\\1"));// \\1表示把第一组的内容拿出来再用一次
        System.out.println("abc123abc".matches("(.+).+\\1"));
    }
}
