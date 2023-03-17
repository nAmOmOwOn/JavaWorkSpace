package My_6grade_VO;

class CalVO {
    private String op1;
    private String op;
    private String op2;
    private int result;

    public CalVO(String op1, String op, String op2) {
        this.op1 = op1;
        this.op = op;
        this.op2 = op2;
    }

    public String getOp1() {
        return op1;
    }
    public String getOp() {
        return op;
    }
    public String getOp2() {
        return op2;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public int getResult() {
        return result;
    }
}
