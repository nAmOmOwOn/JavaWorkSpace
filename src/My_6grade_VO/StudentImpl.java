package My_6grade_VO;

class StudentImpl implements IStudent {
    public void doService(StudentVO vo) {
        System.out.println(vo.getName());
    }
}
