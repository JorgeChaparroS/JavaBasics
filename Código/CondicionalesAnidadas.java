public class CondicionalesAnidadas{
    public static void main(String args[]){
        System.out.println("Este programa ejecuta determinada operación, según desee el usuario");
        int operacion=8;
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
            System.out.println("El resultado de la multiplicación es: " + resultado);
        }
        else if(operacion==4){
            resultado=num1/num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
        else{
            System.out.println("No sirve");
        }
    }
}