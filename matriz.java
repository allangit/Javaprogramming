import javax.swing.JOptionPane;
import java.util.Scanner;

public class matriz {


	public static void main(String [] args){

		int ncol,nfil;
		int matriz[][];
		boolean simetrica=true;
		Scanner entrada= new Scanner(System.in);
		ncol=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas"));
		nfil=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
		matriz=new int[nfil][ncol];

		System.out.println("Digite la matriz");


		for(int i=0; i<nfil;i++){

			for(int j=0; j<ncol; j++){

				System.out.print("Matriz["+i+"]["+j+"]:");
				matriz[i][j]=entrada.nextInt();

			}

		}

		if(nfil==ncol){

			int i,j;
			i=0;
			while(i <nfil && simetrica==true){

				j=0;
				while(i <j && simetrica==true){

					if(matriz[i][j]!=matriz[j][i]){

						simetrica=false;
					}
					j++;

				}
				i++;
			}

			if(simetrica==true){

				JOptionPane.showMessageDialog(null,"Es simetrica");

			}

			else {

				JOptionPane.showMessageDialog(null,"Matriz no es simetrica");
			}

		}
		else{

			JOptionPane.showMessageDialog(null,"Matriz no es simetrica");

		}
	}
}
