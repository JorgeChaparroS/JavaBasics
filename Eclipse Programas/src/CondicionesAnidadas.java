
public class CondicionesAnidadas {
	public static void main(String args[]){
        System.out.println("Este programa ejecuta determinada operaci�n, seg�n desee el usuario");
        int operacion=3;
        int num1=8;
        int num2=4; 
        int resultado=0;
        if(operacion==1){
            resultado=num1+num2;
            System.out.println("El resultado de la suma es: " + resultado);
        }
        else if(operacion==2){
            resultado=num1-num2;
            System.out.println("El resultado de la resta es: " + resultado);
        }
        else if(operacion==3){
            resultado=num1*num2;
            System.out.println("El resultado de la multiplicaci�n es: " + resultado);
        }
        else if(operacion==4){
            resultado=num1/num2;
            System.out.println("El resultado de la divisi�n es: " + resultado);
        }
        else{
            System.out.println("No sirve");
        }
    }
}
