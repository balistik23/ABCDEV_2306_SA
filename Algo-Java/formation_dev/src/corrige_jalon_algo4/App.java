package corrige_jalon_algo4;

import java.util.Scanner;

public class App {
	/*
	 Variables
position est un entier			// utilisé pour l’incrémentation
nb est un entier 				// donnée fournie par l’utilisateur
resultat est une chaine de caractère 	// sera affiché à l’utilisateur à la fin du programme
nbPrecedent est un entier 64 bits	// Nombre précédent dans la suite 
nbCourant est un entier 64 bits		// Nombre courant dans la suite 
nbSuivant est un entier 64 bits		// Nombre suivant dans la suite (celui qu’on est en train de calculer) 

DEBUT PROGRAMME
Lire nb 				// saisie par l’utilisateur
position <-- 2
resultat <--  "\t0\n\t1" 
nbPrecedent <-- 0 		// 1er nombre de la suite 
nbCourant <-- 1			// 2ème nombre de la suite

SI nb EST SUPÉRIEUR À 2 ALORS
	TANT QUE position EST INFÉRIEUR À nb FAIRE
		nbSuivant <-- nbPrecedent + nbCourant
		resultat <-- resultat, "\n\t",  nbSuivant
		nbPrecedent <-- nbCourant
		nbCourant <-- nbSuivant
		position <-- position + 1
	FIN TANT QUE
SINON
	nb <-- 2
FIN SI
Écrire "Les ", nb, " premiers nombres de la suite de Fibonacci sont \n", resultat
FIN PROGRAMME

	 */

	public static void main(String[] args) {
		// declaration des variables 
		
		int position,nb;
		String resultat;
		long nbPrecedent,nbCourant,nbSuivant;
		boolean fermeture_prog = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t[La suite de Fibonacci]");
		do
		{
			System.out.println("\tCombien de nombres de la suite de fibonacci souhaitez vous affiché : ");
			nb = sc.nextInt();
			
			//initialisation des variables
			position = 2;
			resultat =  "\t0\n\t1";
			nbPrecedent = 0;
			nbCourant = 1;
			
			if(nb == 0)
			{
				fermeture_prog = true;
			}
			else
			{
				if(nb > 2)
				{
					while(position < nb)
					{
						nbSuivant = nbPrecedent + nbCourant;
						resultat = resultat+ "\n\t"+  nbSuivant;
						nbPrecedent = nbCourant;
						nbCourant = nbSuivant;
						position = position + 1;
					}
				}
				else 
				{
					nb = 2;
				}
				
				System.out.println("\tLes "+ nb+ " premiers nombres de la suite de Fibonacci sont \n"+ resultat);
				System.out.println("\t"+nb+" nombres affiché\n");
			}
			
		}while(!fermeture_prog);
		
		sc.close();
	}

}