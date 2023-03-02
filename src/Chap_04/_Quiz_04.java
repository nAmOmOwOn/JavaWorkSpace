package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
//        int hour = 4000;
//        int max = 30000;
//        int time = 5;
//        String type = "장애인";
//
//        if (max <= time * hour) {
//            System.out.println("주차 요금은 30000원 입니다.");
//        } else if (max >= time * hour && (type =="경차"|| type == "장애인")) {
//            System.out.println("주차 요금은 " + (time * hour / 2) + "원 입니다.");
//        } else {
//            System.out.println("주차 요금은 " + (time * hour) + "원 입니다.");
//
//        } 내 답

        int hour = 5; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisablePerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000원 곱하기

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisablePerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
