package br.uern.di.pa.abb.confessor.claudio;

interface Ave {
	public void cantar();
	public int voar(int n);
}

public abstract class Passaro implements Ave {}

public class Papagaio extends Passaro{

	public Papagaio(){
	}
	
	public int voar(int n){
		int maxD = 200;
		if(n > maxD) {
			return maxD;
		}
		else {
			return n;
		}
	}
	
	public void cantar() {
		System.out.println("Papagaio legal");
	}

}

public class Currupio extends Passaro {

	public Currupio(){}
	
	public int voar(int n){
		int maxD = 200;
		if(n > maxD) {
			return maxD;
		}
		else {
			return n;
		}
	}
	
	public void cantar() {
		System.out.println("Piu frio fru fri Pió");
	}
	

}
