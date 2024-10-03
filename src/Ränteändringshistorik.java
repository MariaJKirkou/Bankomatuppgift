import java.util.Date;

public class Ränteändringshistorik {
    private Date datumändring;
    private double gammalRänta;
    private double nyRänta;
    private Anställd approvedBy;

    public Ränteändringshistorik(Date datumändring, double gammalRänta, double nyRänta, Anställd approvedBy) {
        this.datumändring = datumändring;
        this.gammalRänta = gammalRänta;
        this.nyRänta = nyRänta;
        this.approvedBy = approvedBy;
    }

    public Date getDatumändring() {
        return datumändring;
    }

    public double getGammalRänta(){
        return  gammalRänta;

    }

    public double getNyRänta() {
        return nyRänta;
    }

    public Anställd getApprovedBy() {
        return approvedBy;
    }
}
