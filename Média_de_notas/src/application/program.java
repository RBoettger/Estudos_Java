package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;
public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite seu nome: ");
		student.nome = sc.next();
		System.out.println("Digite suas notas Trimestrais: ");
		student.primeiroTrimestre = sc.nextDouble();
		student.segundoTrimestre = sc.nextDouble();
		student.terceiroTrimestre = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.somaNotas());
		
		if(student.somaNotas() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.reprovado());
		}else {
			System.out.println("PASS");
		}
		
		
		
		
		sc.close();
	}

}
