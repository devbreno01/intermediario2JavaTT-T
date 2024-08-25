import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = leitor.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = leitor.nextLine();
        System.out.println("Digite seu email: ");
        String email = leitor.nextLine();



        Pattern regexEmail = Pattern.compile("\\w+@\\w+\\.com");
        Matcher matcherEmail = regexEmail.matcher(email);

        Pattern regexCpf = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcherCpf = regexCpf.matcher(cpf);

        if(!matcherEmail.matches()){
            System.out.println("Email invalido");
        } else if(!matcherCpf.matches()){
            System.out.println("Cpf invalido");
        }else {
            System.out.println("Dados Cadastrais: \n " +
             "Nome : "+ nome + " Sobrenome : " + sobreNome + " CPF : " + cpf + " Email : " +email);
            //Dados Cadastrais: \n' 'Campo1 : Valor2' 'Campo2 : Valor2' 'Campo3: Valor3
        }

    }
}