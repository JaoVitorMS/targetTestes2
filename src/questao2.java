import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        verificaLetraA(palavra);

    }
    public static void verificaLetraA(String palavra){
        int count = 0;
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                count++;
            }
        }
        if (count > 0){
            System.out.println("A letra 'a' aparece " + count + " vezes na palavra " + palavra);
        } else {
            System.out.println("A letra 'a' não aparece na palavra " + palavra);
        }
}
}