public class Calculadora {
    public static double soma(double num1, double num2){
        return num1 + num2;
    }
    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        double num1 = 20;
        double num2 = 5;
        System.out.println("soma:" + calc.soma(num1, num2));
        System.out.println("subtração:" + calc.subtracao(num1, num2));
        System.out.println("multiplicação:" + calc.multiplicacao(num1, num2));
        System.out.println("divisão:" + calc.divisao(num1, num2));


    }

}