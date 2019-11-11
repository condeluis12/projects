package practica;

public class intento1 {
static carro carrO12 =new carro("1","2","3","4","5","6");
public static void cambiar(carro e) {
	e.settarifa("8");
	System.out.print(carrO12.gettarifa());
}
//System.out.print(carrO12.matricula());
	public static void main(String[] args) {
	System.out.print("Hola mundo");
	System.out.print(carrO12.gettarifa());
	System.out.print(carrO12.getmodelo());
	cambiar(carrO12);
	}

}
