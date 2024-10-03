import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.List;

public class Konto {
    private double saldo;
    private double räntesats;
    private String kontoNr;
    private List<Konto> account;

    public Konto(double saldo, double räntesats, String kontoNr) {
        this.saldo = saldo;
        this.räntesats = räntesats;
        this.kontoNr = kontoNr;
        this.account = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getRäntesats() {
        return räntesats;
    }
    public void setRäntesats(double räntesats) {
        this.räntesats = räntesats;
    }
    public String getKontoNr() {
        return kontoNr;
    }
    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;

    }
    public List<Konto> getKonton() {        //Hämtar konton
        return account;
    }

    public void addKonton(Konto account) {   //Lägger till konton i lista
        this.account.add(account);
    }
    @Override
    public String toString(){
        return "Kontonr " + getKontoNr() + " Har saldo " + getSaldo() + ". Med en räntesats på " + getRäntesats() + "%.";
    }
}

