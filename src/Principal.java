
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        Scanner leia;
        leia = new Scanner(System.in);
        
        Aluno alu;
        alu = new Aluno(); //instanciando o objeto
        
        System.out.println("Nome:       ");
        alu.nome = leia.next();
        
        System.out.println("Disciplina: " );
        alu.disciplina = leia.next();
        
        System.out.println("Nota1:      ");
        alu.nota1 = leia.nextDouble();
        
        System.out.println("Nota2       ");
        alu.nota2 = leia.nextDouble();
        
                
//        alu.media = (alu.nota1 + alu.nota2)/2;
//        
//        System.out.println("-------------------------");
//        
//        System.out.println("Média final: " + alu.media);

//    ou usando os metodos da classe:
        
        alu.calcularMedia();
        
        System.out.println("-------------------------");
        
        System.out.println("Média final: " + alu.media);
        
        
        
    }
    
}
