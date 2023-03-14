package My_instanceof;

class TestChild {
    public static void main(String[] args) {
        Parent p = new Child2();

        if (p instanceof Child) {
            p.doService();
        } else if (p instanceof Child2) {
            p.doService();
        } else {
            System.out.println("내 자식 아님");
        }
    }
}
