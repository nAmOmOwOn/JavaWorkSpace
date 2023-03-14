package My_Try2;

class TestCal {
    public static void main(String[] args) {
        Cal cal = new Cal();

        try{
            cal.doCal(args);
        } catch (AddZeroException e){
            System.out.println(e.getMessage());
        }

        //NumberFormatException
        //ArrayIndexOutOfBoundsException
        //ArithmeticException
        //Exception
    }
}
