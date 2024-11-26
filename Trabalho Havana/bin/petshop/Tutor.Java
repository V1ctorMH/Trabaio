package petshop;

public class Tutor extends Mae {
    private String nome_do_pet; 
    private String telefone;    
    private String cpf;         
    private String endereco; 

    public Pet(String nome, Data data_registro, Integer id, Integer idade, String nome_do_pet, String telefone, String cpf, String endereco) {
        super(nome, data_registro, id, idade);
        this.nome_do_pet = nome_do_pet;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }


    public String getNomeDoPet() {
        return nome_do_pet;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setNomeDoPet(String nome_do_pet) {
        this.nome_do_pet = nome_do_pet;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}