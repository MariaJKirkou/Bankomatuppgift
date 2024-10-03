import java.util.ArrayList;
import java.util.List;

public class Anställd{

    private String namn;
    private String persNr;
    private int lön;
    private List<Anställd> anställda;

    public Anställd(String namn, String persNr, int lön) {
        this.namn = namn;
        this.persNr = persNr;
        this.lön = lön;
        this.anställda = new ArrayList<>();
    }

    public String getNamn() {
        return namn;
    }

    public String getPersNr() {
        return persNr;
    }

    public int getLön() {
        return lön;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setPersNr(String persNr) {
        this.persNr = persNr;
    }

    public void setLön(int lön) {
        this.lön = lön;
    }

    public List<Anställd> getAnställda() {               //Hämtar anställd
        return anställda;
    }
    public void läggTillAnställd(Anställd anställd) {    //Lägger till anställd
        this.anställda.add(anställd);
    }

    @Override
    public String toString(){
        return "Anställd" + namn + '\'' +
                " har'" + lön + "i lön" + '}';
    }
}

