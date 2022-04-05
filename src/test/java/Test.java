import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2022-10-10 10:10:10";
        System.out.println(sdf.format(date));
        int count = sdf.format(date).compareTo(time);
        System.out.println(count );

        if("0".equals(time)){
            System.out.println("常量写在前面不会引起空指针异常");
        }else{
            System.out.println("回引起空指针异常");
        }
        String allowIps="192.168.2222,444444";
        String ip = "44444";
        if(allowIps.contains(ip)){
            System.out.println("允许访问");
        }else{
            System.out.println("不允许");
        }
    }
}
