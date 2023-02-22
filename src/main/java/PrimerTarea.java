
import java.util.Scanner;

public class PrimerTarea {

    public static void main(String[] args) {
        System.out.print("Introduce tu nombre, profesion y pais de origen: ");
	 Scanner teclado = new Scanner(System.in);
	//guardamos en nueva variable los datos introducidos 
	 String datos = teclado.nextLine();
	 //separamos las cadenas de caracteres 
	 String[] separacion = datos.split(" ");
	 // se crean nuevas variables para imprimir cada dato en los arreglos, cambiandolo a mayuscula 
	 String nombre = separacion[0].toUpperCase();
	 System.out.println("Nombre: " + nombre );

	 String profesion = separacion[1].toUpperCase();
	 System.out.println("Profesion: " + profesion);

	 String pais = separacion[2].toUpperCase();
	 System.out.println("Pais de origen: " + pais);

    }
}
