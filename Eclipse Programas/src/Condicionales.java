
public class Condicionales {
	public static void main(String args[]){
        double matematicas=5;
        double biologia=10;
        double quimica=7;
        double promedio=0;
        promedio=(matematicas+biologia+quimica)/3;
        if(promedio>=6){
            System.out.println("El estudiante aprob�, su promedio fue: " + promedio);
        }
        else{
            System.out.println("El estudiante reprob�, su promedio fue: " + promedio);
        }
    }
}
