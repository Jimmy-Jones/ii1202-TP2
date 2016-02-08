import java.util.Scanner;

public class regle{
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("longueur?");
    int longueur=demandervaleur();
    System.out.println("intervalle?");
    int intervalle=demandervaleur();

    int k=0;
    for (int i=0;i<longueur +1; i++){
             if (k==0){
                      System.out.print("|");
                      k++;
                      }
    
              else if ( k== intervalle -1) {
                      k=0;
                      System.out.print("-");
                      }
              else{ System.out.print("-");
                    k++;
                      }
     }
}
public static int demandervaleur(){
      Scanner sc=new Scanner (System.in);
      int valeur = sc.nextInt();
      return valeur;
      }
}
