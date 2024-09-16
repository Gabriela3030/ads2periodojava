package task4;


public class pessoa {
    // Atributos encapsulados
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;
    private String genero;
    private double altura;
    private double peso;

    // Construtor vazio
    public pessoa() {
    }

    // Construtor com todos os atributos
    public pessoa(String nome, int idade, String cpf, String rg, String endereco, String telefone, String email, String genero, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters e Setters para encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        // Criando duas instâncias de pessoa e preenchendo seus dados
        pessoa pessoa1 = new pessoa();
        pessoa1.setNome("João da Silva");
        pessoa1.setIdade(30);
        pessoa1.setCpf("123.456.789-00");
        pessoa1.setRg("12.345.678-9");
        pessoa1.setEndereco("Rua A, 100");
        pessoa1.setTelefone("(11) 91234-5678");
        pessoa1.setEmail("joao.silva@email.com");
        pessoa1.setGenero("Masculino");
        pessoa1.setAltura(1.75);
        pessoa1.setPeso(80.0);

        pessoa pessoa2 = new pessoa("Maria Oliveira", 25, "987.654.321-00", "98.765.432-1", "Rua B, 200", "(11) 99876-5432", "maria.oliveira@email.com", "Feminino", 1.65, 60.0);

        // Exibindo dados da pessoa1
        System.out.println("Dados da pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("RG: " + pessoa1.getRg());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Gênero: " + pessoa1.getGenero());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());

        // Exibindo dados da pessoa2
        System.out.println("\nDados da pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("RG: " + pessoa2.getRg());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("Email: " + pessoa2.getEmail());
        System.out.println("Gênero: " + pessoa2.getGenero());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Peso: " + pessoa2.getPeso());
    }
}