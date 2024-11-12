import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private Map<String, Cliente> clientes = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar cliente
    public void adicionarCliente(String cpf, Cliente cliente) {
        clientes.put(cpf, cliente);
    }

    // Método para adicionar conta
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para listar todos os clientes
    public void listarClientes() {
        System.out.println("Clientes do Banco:");
        for (String cpf : clientes.keySet()) {
            Cliente cliente = clientes.get(cpf);
            System.out.println("CPF: " + cpf + " - Nome: " + cliente.getNome());
        }
    }

    // Método para listar todas as contas
    public void listarContas() {
        System.out.println("Contas do Banco:");
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.cliente.getNome());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("-----");
        }
    }
}