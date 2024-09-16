package task4;

public class computador {
    // Atributos
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String placaGrafica;
    private String sistemaOperacional;
    private double tamanhoTela;
    private boolean temSSD;
    private String fabricante;

    // Construtor vazio (sem parâmetros)
    public computador() {
        // Construtor vazio
    }

    // Construtor com alguns atributos
    public computador(String processador, int memoriaRAM, String sistemaOperacional, boolean temSSD) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.sistemaOperacional = sistemaOperacional;
        this.temSSD = temSSD;
    }

    // Construtor com todos os atributos
    public computador(String processador, int memoriaRAM, int armazenamento, String placaGrafica, String sistemaOperacional, double tamanhoTela, boolean temSSD, String fabricante) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaGrafica = placaGrafica;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.temSSD = temSSD;
        this.fabricante = fabricante;
    }

    // Métodos Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getPlacaGrafica() {
        return placaGrafica;
    }

    public void setPlacaGrafica(String placaGrafica) {
        this.placaGrafica = placaGrafica;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public boolean isTemSSD() {
        return temSSD;
    }

    public void setTemSSD(boolean temSSD) {
        this.temSSD = temSSD;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Métodos adicionais
    public void ligar() {
        System.out.println("O computador está ligado.");
    }

    public void desligar() {
        System.out.println("O computador está desligado.");
    }

    public void reiniciar() {
        System.out.println("O computador está reiniciando.");
    }

    public void exibirInformacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Placa Gráfica: " + placaGrafica);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Possui SSD: " + (temSSD ? "Sim" : "Não"));
        System.out.println("Fabricante: " + fabricante);
    }

    public static void main(String[] args){
        computador computador1 = new computador(
                "Intel Core i7",
                16,
                512,
                "NVIDIA GTX 1650",
                "Windows 10",
                15.6,
                true,
                "Dell"
        );

        // Exibindo as informações do computador1
        System.out.println("Informações do computador 1:");
        computador1.exibirInformacoes();

        // Criando uma instância do computador com um construtor diferente (parcial)
        computador computador2 = new computador(
                "AMD Ryzen 5",
                8,
                "Linux Ubuntu",
                true
        );

        // Exibindo as informações do computador2 (com valores definidos via setters)
        computador2.setArmazenamento(256);
        computador2.setPlacaGrafica("Radeon RX 560");
        computador2.setTamanhoTela(14.0);
        computador2.setFabricante("Lenovo");

        System.out.println("\nInformações do computador 2:");
        computador2.exibirInformacoes();

        // Ligando, desligando e reiniciando o computador1
        computador1.ligar();
        computador1.reiniciar();
        computador1.desligar();
    }
}
