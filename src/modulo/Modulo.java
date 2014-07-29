package modulo;

public class Modulo {
	
	public static boolean validar(String argumento){
		if(argumento == null){
			return false;
		}
		return argumento.trim().length() > 0;
	}
}
