
import java.util.Arrays;

public class Movies {
	
	public static void main(String[] args){
		
		String[] listMovies = {"titremovie1", "titremovie2", "titremovie3"};
		
		String[] titremovie1 = {"acteur1", "acteur2", "acteur3"};
		String[] titremovie2 = {"acteur4", "acteur5", "acteur6"};
		String[] titremovie3 = {"acteur7", "acteur8", "acteur9"};
		
		String[][] acteurs;
		
		acteurs = new String[][] {
			titremovie1,
			titremovie2,
			titremovie3		
	};
		
	

	for (int i=0; i < listMovies.length; i++){
		
	System.out.println("Dans le film " + listMovies[i] +  " les principaux acteurs sont: " + acteurs[i][0] + ", " + acteurs[i][1] + ", " +   acteurs[i][2]);
	
	};
};

};
	
	
