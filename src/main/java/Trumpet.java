public class Trumpet extends Instrument {
    private int numberOfValves;

    public Trumpet(String color, String material, String brand, int buyingPrice, int sellingPrice, int numberOfValves){
        super(color, material, brand, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String playAnInstrument(){
        return "I am playing the trumpet";
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
