package entities;

public class Conta {
    
    private Integer ag;
    private Double numeroConta;
    private String cpf;
    private String titular;
    private Double saldo = 0.0;

    public Conta(Integer ag, Double numeroConta, String cpf, String titular, Double saldo) {
        this.ag = ag;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getAg() {
        return ag;
    }

    public void setAg(Integer ag) {
        this.ag = ag;
    }

    public Double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double Depositar(Double deposito){
        return saldo += deposito;
    }
    
    public Double sacar(Double saque){
        return saldo -= saque + 5.0;
    }

    @Override
    public String toString() {
        return "Agência: " + ag 
        + ", Número da Conta: " + numeroConta 
        + ", CPF: " + cpf 
        + ", Titular: " + titular 
        + ", Saldo: " + saldo;
    }        
}
