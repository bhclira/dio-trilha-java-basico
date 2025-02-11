public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("123", "Marcos");

        
        
        pessoa.setEndereco("Rua 1, nº 1");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }

}
