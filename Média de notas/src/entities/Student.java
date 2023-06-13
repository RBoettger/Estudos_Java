package entities;

public class Student {
	
	public String nome;
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	public double somaNotas() {
		return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
			
	}
	public double reprovado() {
		if(somaNotas() < 60.0) {
			return 60.0 - somaNotas();
		}else {
			return 0.0;
		}
	}
}
