import javax.swing.JOptionPane;
import java.util.Scanner;

public class ejemplo1 {


	public static void main (String[] args){


		int nElementos;
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de datos="));
		Scanner entrada=new Scanner(System.in);
		char []letras= new char[nElementos];
		System.out.println("Digite los Elementos=");

		for(int i=0;i<nElementos;i++){

			System.out.print((i+1) +"Digite el Caracter");
			letras[i]=entrada.next().charAt(0);
		}

		System.out.println("los caracteres de los elementos son::");

		for(int i=0; i<nElementos;i++){


			System.out.println(letras[i]+"\t");

		}

	}



}
