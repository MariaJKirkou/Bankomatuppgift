public class Lån {

    private double saldo;
    private double ränta;
    private Anställd approvedBy;

    public Lån(double amount, double interestRate, Anställd approvedBy) {
        this.saldo = amount;
        this.ränta = interestRate;
        this.approvedBy = approvedBy;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRänta() {
        return ränta;
    }

    public Anställd getApprovedBy() {
        return approvedBy;
    }

    public void setRänta(double ränta) {
        this.ränta = ränta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString(){
        return "Anställd som beviljat lån är " + approvedBy.getNamn() + "\n"
                + "Räntan är " + getRänta() + " och saldot är " + getSaldo() + "\n";
    }
}
