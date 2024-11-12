public class Main {

    public static void main(String[] args) {
        // Instância do banco
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");

        // Criação dos clientes e suas contas
        Cliente cliente01 = new Cliente();
        cliente01.setNome("Pricilla");
        
        Cliente cliente02 = new Cliente();
        cliente02.setNome("Sid");

        Cliente cliente03 = new Cliente();
        cliente03.setNome("Prirley");

        // Adiciona clientes ao banco com CPF 
        banco.adicionarCliente("12345678901", cliente01);
        banco.adicionarCliente("23456789012", cliente02);
        banco.adicionarCliente("33496789013", cliente03);

        // Criação das contas
        Conta cc01 = new ContaCorrente(cliente01);
        Conta contaPoupanca01 = new ContaPoupanca(cliente01);

        Conta cc02 = new ContaCorrente(cliente02);

        Conta cc03 = new ContaCorrente(cliente03);
        Conta contaPoupanca03 = new ContaPoupanca(cliente03);
        


        // Adiciona contas ao banco
        banco.adicionarConta(cc01);
        banco.adicionarConta(contaPoupanca01);

        banco.adicionarConta(cc02);

        banco.adicionarConta(cc03);
        banco.adicionarConta(contaPoupanca03);

        // Realiza operações nas contas
        cc01.depositar(600);
        cc01.transferir(100, contaPoupanca01);

        cc02.depositar(2800);

        cc03.depositar(450);
        cc03.transferir(100, contaPoupanca03);

        // Exibe extratos individuais
        cc01.imprimirExtrato();
        contaPoupanca01.imprimirExtrato();
        cc02.imprimirExtrato();

        // Listagem de todos os clientes e contas no banco
        System.out.println("\n----- Listagem de Clientes -----");
        banco.listarClientes();

        System.out.println("\n----- Listagem de Contas -----");
        banco.listarContas();
    }
}
