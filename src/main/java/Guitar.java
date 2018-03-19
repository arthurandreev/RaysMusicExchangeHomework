public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String color, String material, String brand, int buyingPrice, int sellingPrice, int numberOfStrings){
        super(color, material, brand, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String playAnInstrument(){
        return "I am playing the guitar";
    }
}
