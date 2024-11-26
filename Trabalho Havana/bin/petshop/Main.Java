package petshop;

public class Main {
    public static void main(String[] args) {
        Pet Animal1 = new Pet("Princesa", 11, 1, 2, "PitBull", "Feminino", "Carnivoro", "Carlos", 23, 47);
        Pet Animal2 = new Pet("robervaldo", 2, 2, 3, "dalmata", "Feminino", "Carnivoro", "Felipe", 18, 50);
        Pet Animal3 = new Pet("tonhão", 34, 3, 2, "pincher", "Masculino", "Carnivoro", "Isadora", 5, 7);


        Tutor Pessoa1 = new Tutor("Carlos", 44, 1, 54, "Princesa", "(55) 81 99487-4200", "123.456.789-00", "Rua A, 123");
        Tutor Pessoa2 = new Tutor("Felipe", 23, 2, 9999, "robervaldo", "(55) 81 98807-4200", "987.654.321-00", "Rua B, 456");
        Tutor Pessoa3 = new Tutor("Isadora", 23, 3, 17, "tonhão", "(55) 81 98897-4298", "111.222.333-44", "Rua C, 789");


        System.out.println("Nome do pet: " + Animal1.getNome());
        System.out.println("Nome do tutor: " + Pessoa1.getNomeDoPet());
    }
}