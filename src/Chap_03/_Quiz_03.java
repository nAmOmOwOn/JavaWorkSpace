package Chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String Number = "890520-1047116";
        System.out.println(Number.substring(0,8));
        Number = "030708-4567890";
        System.out.println(Number.substring(0,Number.indexOf("-")+2));

    }
}
