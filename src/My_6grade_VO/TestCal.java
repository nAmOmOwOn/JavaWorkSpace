package My_6grade_VO;

class TestCal {
    public static void main(String[] args) {
        CalImpl c = new CalImpl();
        CalVO vo = new CalVO(args[0], args[1], args[2]);
        c.doService(vo);
        System.out.println(vo.getResult());
    }
}
