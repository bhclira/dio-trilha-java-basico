public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // metodo construtor
    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // métodos getters and setters
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
