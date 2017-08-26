public class Persona{
	
	String name;
	String sexo;
	int edad;
	
	public void caminar(){
		
		System.out.println(name + " Esta comiendo");
	}
	
	public void estudiar(){
		System.out.println(name + " Esta estudiando");
	}
	
	public void comer(String comida){
		System.out.println(name + " Esta comiendo " + comida);
	}
	
	public void pedirCervesa(){
		if(edad >= 18){
			System.out.println("Dar cerveza");
		}
		else{
			System.out.println("No tienes edad para tomar");
		}
	}
	
}
class Curso{
	public static void main(String[] args){
		Persona juan = new Persona();
		juan.name = "JUAN PEREZ";
		juan.sexo = "M";
		juan.edad = 15;
		juan.caminar();
		juan.estudiar();
		juan.comer("Torta Cubana + Guacamole");
		juan.pedirCervesa();
		
		Persona bety = new Persona();
		bety.name = "BEATRIZ";
		bety.sexo = "F";
		bety.edad = 20;
		bety.caminar();
		bety.estudiar();
		bety.comer("Tacos al pastor");
		bety.pedirCervesa();
	}
	
	
}
	
	
	