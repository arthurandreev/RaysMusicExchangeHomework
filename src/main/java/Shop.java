import java.util.ArrayList;

public class Shop {
    private Guitar guitar;
    private Piano piano;
    private Trumpet trumpet;

    private ArrayList<ISell> stock;


    public Shop(Guitar guitar, Piano piano, Trumpet trumpet){
        this.guitar = guitar;
        this.piano = piano;
        this.trumpet = trumpet;
        this.stock.add(guitar);
        this.stock.add(piano);
        this.stock.add(trumpet);
    }


}
