package Chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 글자 곱하기만 생각하고,, 더하기 생각 못함..
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        System.out.println(getHiddenData(name,1));
    }
}
