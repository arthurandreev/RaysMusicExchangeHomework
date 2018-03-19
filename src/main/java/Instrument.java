public abstract class Instrument implements IPlay, ISell {
    private String color;
    private String material;
    private String brand;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String color, String material, String brand, int buyingPrice, int sellingPrice){
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String playAnInstrument(){
        return "Playing a generic instrument!";
    }

    public int calculateMarkUp(){
        return this.sellingPrice - this.buyingPrice;
    }

}
