import java.util.ArrayList;
import java.util.List;

public class Kund{

    private String namn;
    private String persNr;
    private List<Konto> konton;
    private List<Lån> lån;

    public Kund(String namn, String persNr) {
        this.namn = namn;
        this.persNr = persNr;
        this.konton = new ArrayList<>();
        this.lån = new ArrayList<>();
    }
    public void setPersNr(String persNr) {
        this.persNr = persNr;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public String getPersNr() {
        return persNr;
    }

    public List<Konto> getKonton() {        //Hämtar konton
        return konton;
    }

    public void addKonton(Konto konton) {   //Lägger till konton i lista
        this.konton.add(konton);
    }

    public List<Lån> getLån() {               //Hämtar lån
        return lån;
    }

    public void addLån(Lån lån) {              //Lägger till lån i lista
        this.lån.add(lån);
    }

    @Override
    public String toString() {
        return "Kund{" +
                "namn='" + namn + '\'' +
                ", persNr='" + persNr + '\'' +
                ", konton=" + konton +
                ", lån=" + lån +
                '}';
    }


}
