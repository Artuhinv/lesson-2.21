import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для задания 4.1: ");
        String str = in.nextLine();
        System.out.println("Введите подстроку: ");
        String substr = in.nextLine();
        less_1(str, substr);
        
        System.out.println("Введите строку для задания 4.2: ");
        String str1 = in.nextLine();
        less_2(str1);

        System.out.println("Введите дату формата '31.12.2020' для задания 4.3: ");
        String date = in.nextLine();
        less_3(date);
        less_4(date);
    }
    public static void less_1(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        System.out.println("Кол-во вхождений подстроки в строку: " + count);
    }
    public static void less_2(String str){
        System.out.println(str.replaceAll("кака | бяка", "вырезано цензурой"));
    }
    public static void less_3(String str) {
        String[] arr = str.split("\\.");
        System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);
    }
    public static void less_4(String str) {
        SimpleDateFormat ft  = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = ft.parse(str);
            ft.applyPattern("yyyy-MM-dd");
            System.out.println(ft.format(date));
        }
        catch (ParseException e){
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }
}
