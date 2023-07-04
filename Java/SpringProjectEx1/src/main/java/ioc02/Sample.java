package ioc02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

class Sample1{
    Sample1(String str){
        System.out.println("Sample1 생성됨 :  "+str); }
}
class Sample2{
    Sample2(String str, int data){
        System.out.println("Sample2 생성됨 :  "+str+ ", "+data);  }
}
class Sample3{
    Sample3(int data, String str){
        System.out.println("Sample3(int,String) "+data+ ","+str); }
    Sample3(String str, int data){
        System.out.println("Sample3(String,int) "+str+ ","+data); }
}
class Sample4{
    Sample4(int data, String str){
        System.out.println("Sample4(int,str) "+data+ ","+str);    }
}


public class Sample  {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("sample.xml");
        Sample1 s1 = (Sample1)factory.getBean("sample1");
        Sample2 s2 = (Sample2)factory.getBean("sample2");
        Sample3 s3 = (Sample3)factory.getBean("sample3");
        Sample4 s4 = (Sample4)factory.getBean("sample4");
    }
}