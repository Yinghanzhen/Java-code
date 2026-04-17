package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long l  = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(Runtime.getRuntime().availableProcessors());

       ArrayList<Student> student = new ArrayList<>();
    loop:while (true) {
        System.out.println("1添加学生");
        System.out.println("2删除学生");
        System.out.println("3修改学生");
        System.out.println("4查询学生");
        System.out.println("5退出");
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            case "1":
                addstudent(student);
                break;
            case "2":
                deletestudent(student);
                break;
            case "3":
                updatestudent(student);
                break;
            case "4":
                querystudent(student);
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }

   }


    }

    public static void addstudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入id");
        String id = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入地址");
        String address = sc.next();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        list.add(student);
        System.out.println("添加成功");
    }
    public static void deletestudent(ArrayList<Student> list){
        System.out.println("请输入要删除的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if(getindex(list,id)!=-1){
            list.remove(getindex(list,id));
            System.out.println("删除成功");
        }
        else System.out.println("id不存在");
    }
    public static void updatestudent(ArrayList<Student> list){
        System.out.println("请输入要修改的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if(getindex(list,id)!=-1){
            Student student = list.get(getindex(list,id));
            System.out.println("请输入姓名");
            String name = sc.next();
            student.setName(name);
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            student.setAge(age);
            System.out.println("请输入姓名");
            String address = sc.next();
            student.setAddress(address);
        }
        else System.out.println("id不存在");
    }
    public static void querystudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("信息为空");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }
    public static int getindex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);

            if(student.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}

