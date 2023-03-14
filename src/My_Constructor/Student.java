package My_Constructor;

class Student {
    Student() {
        System.out.println("기본생성자");
    }

    Student(String name) {
        System.out.println("일반생성자 :: " + name);
    }

    void doService(String name) {
        System.out.println("맴버메소드 :: " + name);
    }
}
