package My_6grade_VO;

public class TestStudent {
    public static void main(String[] args) {
        StudentImpl st = new StudentImpl();
        StudentVO vo = new StudentVO();
        vo.setName("홍길동");
        st.doService(vo);
    }
}
