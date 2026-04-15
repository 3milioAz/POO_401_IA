package unidad2.practicas.actAprenIndep;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if(saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

class Main2 {
    public static void main(String[] args) {

        CuentaBancaria morrallita = new CuentaBancaria(1000);

        morrallita.depositar(500);
        morrallita.retirar(200);
        morrallita.retirar(1300.5);

        System.out.println("Saldo: $" + morrallita.getSaldo());
    }
}

