package petshop;

public class Mae{
    private String nome;
    private Integer data_registro;
    private Integer id;
    private Integer idade;


    public Mae(String nome, Integer data_registro, Integer id, Integer idade){
        this.nome = nome;
        this.data_registro = data_registro;
        this.id = id;
        this.idade = idade;
    }

    
    public String getNome(){
        return nome;
    }

    public Integer getData(){
        return data_registro;
    }

    public Integer getId(){
        return id;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setData(Integer data_registro){
        this.data_registro = data_registro;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }
}