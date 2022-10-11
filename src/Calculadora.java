
public class Calculadora {
	
	public static double suma(double operador1, double operador2) {
		return operador1+operador2;
	}
	
	public static double resta(double operador1, double operador2) {
		return operador1-operador2;
	}
	
	public static double producto(double operador1, double operador2) {
		return operador1*operador2;
	}
	
	public static double division(double operador1, double operador2) {
		if(operador2!=0)
			return operador1/operador2;
		
		else 
			return -1;
	}
}
