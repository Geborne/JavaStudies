public class CriaConta {
    public static void main (String[] args){
        Conta Conta1 = new Conta();
        Conta1.Saldo = 500;
        Conta1.Nome = "Dora";
        Conta1.Numero = 10101010;

        System.out.println("\nSeu saldo inicial era: " + Conta1.Saldo + ".");
        System.out.println("Depois do depósito, seu saldo é:  " + (Conta1.Saldo+100) + ".");

        Conta Conta2 = new Conta();
        Conta2.Saldo = 100000;
        Conta2.Nome = "Diego";
        Conta2.Numero = 01010101;

        System.out.println("\nSeu saldo inicial era: " + Conta2.Saldo + ".");
        System.out.println("Depois do depósito, seu saldo é:  " + (Conta2.Saldo+100) + ".");


    }
}


