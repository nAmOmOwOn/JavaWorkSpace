package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
//        int[] sizes = new int[10];
//        int size = 250;
//        for (int i = 0; i < sizes.length; i++) {
//            sizes[i] = size + i*5;
//            System.out.println("사이즈 " + sizes[i] + "(재고 있음)");
//
//        } 내 답
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
