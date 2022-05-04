import java.util.Scanner;
public class projectcar {

    private static Scanner leia;
    public static void main(String[] args) throws Exception {
        char tipodeCurso= 0;
        
        while (tipodeCurso!= 'G' && tipodeCurso!= 'P') {
            System.out.println("Tipo de curso [G/P]: ");
            tipodeCurso = leia.nextLine() .charAt(0);
            tipodeCurso = Character.toUpperCase(tipodeCurso);
            if (tipodeCurso!= 'g' && tipodeCurso!= 'p') {
                System.out.println("Tipo de curso incorreto");
            }
            if (tipodeCurso=='G') {
                System.out.println("Graduação");
                
            } else {
                System.out.println("Pós-Graduação");
            }
        }
    }
}