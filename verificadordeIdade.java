public class VerificadorDeIdade {

    public static void main(String[] args) {
        int idade = 17;

        int anoAtual = 2025;
        int anoNascimentoAproximado = anoAtual - idade;
        
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("O ano de nascimento aproximado é: " + anoNascimentoAproximado);
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
