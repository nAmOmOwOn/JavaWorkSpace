package My_Super;

class Child extends Parent{
    String name;

    Child() {
        this("무명");
    }

    Child(String name) {
        super("강감찬");
        this.name = name;
    }

    void setName(String name) {
        super.doService();
        this.name = name;
    }
}
