public class Piano extends Instrument {
    private String finish;

    public Piano(String color, String material, String brand, int buyingPrice, int sellingPrice, String finish) {
        super(color, material, brand, buyingPrice, sellingPrice);
        this.finish = finish;
    }

    @Override
    public String playAnInstrument(){
        return "I am playing the Piano";
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }


}
