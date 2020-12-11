import java.util.Scanner;

public class Solucio_20201127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arrMajuscules [] = new char[26];
		char arrMinuscules [] = new char[26];
		int i;
		
		// /* Enunciat 1A  --> per activar comentar aquesta línia
		System.out.print("Enunciat 1A\n\n\n");
		
		// for per introduir dades a arrMajuscules
		for (i=65; i<90; i++) {  // for per recorrer les files
			arrMajuscules[i-65] = (char) i;
		}
		
		// for per introduir dades arrMinuscules
		for (i=97; i<122; i++) {  // for per recorrer les files
			arrMinuscules[i-97] = (char) i;
		}
		
		/*
		* FINAL Enunciat 1A 
		*/

		/* Enunciat 1B  --> per activar comentar aquesta línia
		int j;
		System.out.print("Enunciat 1B\n\n\n");
		// for per introduir dades a arrMajuscules i arrMinusc¡ules a l'hora

		for (i=65, j=97; i<90; i++, j++) {  // for per recorrer les files
			arrMajuscules[i-65] = (char) i;
			arrMinuscules[j-97] = (char) j;
		}
		/*
		* Enunciat 1B 
		*/	

		/* Enunciat 1C  --> per activar comentar aquesta línia
		char arrLletres[] = new char[52];
		int k;
		System.out.print("Enunciat 1C\n\n\n");
		// for per introduir dades a arrLletres

		for (i=65, j=97, k=0; k<26; k++, i++, j++) {  // for per recorrer les files
			arrLletres[k] = (char) i;
			arrLletres[k+26] = (char) j;
		}
		
		/*
		* FINAL Enunciat 1C 
		*/
		

		int indexEntrat; // conté l'index de la lletra escollida
		char tipusLletraEntrat; // m per minúscules o M per majúscules
		String frase="";
		char lletraAAfegir;
		final char minuscules='m';
		final char majuscules='M';
		
		Scanner teclatEnter = new Scanner (System.in);
		Scanner teclatCadena = new Scanner (System.in);
		
		do {
			do { // bucle per comprobar que l'index es troba dins
				 // del rang de 1 a 26 o -1
				System.out.print("Entra l'índex del caràcter\nque"
						       + "vols escriure\n(A: 1, Z: 26, -1"
						       + " per acabar): ");
				indexEntrat = teclatEnter.nextInt();
				if ((indexEntrat < 1 || indexEntrat > 26) && indexEntrat != -1) {
					System.out.println("Error! El valor ha d'estar\n"
							+ "entre 1 i 26 o -1 per acabar.\n");
				}
			} while ((!(indexEntrat >= 1 && indexEntrat <= 26)) && !(indexEntrat == -1) );
			if (indexEntrat != -1) { // no demanar tipusLletraEntrat si 
				// l'usuari ha entrat -1 per acabar
				do { // bucle per comprobar que el tipusLletraEntrat es 
					 // 'm' per minuscules o 'M' per majuscules
					System.out.print("Vols que el caràcter sigui\n"
							+ "majúscules (M) o minúscules (m): ");
					tipusLletraEntrat = teclatCadena.next().charAt(0);
					if (tipusLletraEntrat != minuscules &&
					      tipusLletraEntrat != majuscules) {
						System.out.println("Error! El valor ha de ser\n"
								+ "majúscules (M) o minúscules (m)\n");
					}				
				} while (tipusLletraEntrat != minuscules && 
						tipusLletraEntrat != majuscules);
				
				if (tipusLletraEntrat == minuscules) {
					
					// /* Enunciat 2A i 2B (1/2) --> per activar comentar aquesta línia
					lletraAAfegir = arrMajuscules[indexEntrat - 1];
				
					/*
					* FINAL Enunciat 2A i 2B (1/2)
					*/
					
					/* Enunciat 2C (1/2)  --> per activar comentar aquesta línia
					lletraAAfegir = arrLletres[indexEntrat + 26 - 1];
				
					/*
					* FINAL Enunciat 2C  (1/2) 
					*/	
					frase = frase + lletraAAfegir;
					System.out.println("S'afagira una \"" + 
								lletraAAfegir + 
			                   	"\" a la cadena.\n");
				} else {
					if (tipusLletraEntrat == majuscules) {
						
						// /* Enunciat 2A i 2B (2/2) --> per activar comentar aquesta línia
						lletraAAfegir = arrMinuscules[indexEntrat - 1];
					
						/*
						* FINAL Enunciat 2A i 2B (2/2)
						*/
						
						/* Enunciat 2C (2/2) --> per activar comentar aquesta línia
						lletraAAfegir = arrLletres[indexEntrat - 1];
					
						/*
						* FINAL Enunciat 2C (2/2) 
						*/
						frase = frase + lletraAAfegir;
						System.out.println("S'afagira una \"" + 
								lletraAAfegir + 
				                   	"\" a la cadena.\n");
					}	
				}

			}		
		} while (indexEntrat != -1);
		
		if (frase.length() != 0) { // condició per comprobar 
			// que la frase no és buida
			System.out.println("\nLa cadena final és: " + frase);
		}
		System.out.println("\nFINAL!");
		teclatEnter.close();
		teclatCadena.close();
	}

}
