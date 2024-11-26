package petshop;

public class Pet extends Mae {
    private String sexo;
    private String dieta;
    private String nome_dono;
    private float peso;            
    private float altura;          
    private String raca;           


    public Pet(String nome, Data data_registro, Integer id, Integer idade, String raca, String sexo, String dieta, String nome_dono, float peso, float altura) {
        super(nome, data_registro, id, idade); 
        this.raca = raca;
        this.sexo = sexo;
        this.dieta = dieta;
        this.nome_dono = nome_dono;
        this.peso = peso;
        this.altura = altura;
    }


    public String getRaca() {
        return raca;
    }
    public String getSexo() {
        return sexo;
    }

    public String getDieta() {
        return dieta;
    }

    public String getNomeDono() {
        return nome_dono;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void setNomeDono(String nome_dono) {
        this.nome_do_dono = nome_dono;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}