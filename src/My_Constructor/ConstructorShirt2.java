package My_Constructor;

public class ConstructorShirt2 {
    private int shirtID = 0;
    private String description = "-description required-";

    private char colorCode = 'U';
    private double price = 0.0;
    private int quantityInStock = 0;

    public ConstructorShirt2() {
        colorCode = 'R';
    }

    public ConstructorShirt2(char startingCode) {

        switch (startingCode) {
            case 'R':
            case 'G':
            case 'B':
                colorCode = startingCode;
                break;
            default:
                System.out.println("Invalid colorCode, Use R, G, or B");
        }
    }

    public ConstructorShirt2(char startingCode, int startingQuantity){

        switch (startingCode) {
            case 'R':
                colorCode = startingCode;
                break;
            case 'G':
                colorCode = startingCode;
                break;
            case 'B':
                colorCode = startingCode;
                break;
            default:
                System.out.println("Invaild colorCode. Use R, G, or B");
        }

        if (startingQuantity > 0 && startingQuantity < 2000){
            quantityInStock = startingQuantity;
        } else {
            System.out.println("Invalid quantity. Must be > 0 and < 2000");
        }

    }

    public char getColorCode() {
        return colorCode;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
