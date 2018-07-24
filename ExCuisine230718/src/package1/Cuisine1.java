package package1;

// J'ai créé ma classe qui va executer mon code avec la méthode main 

public class Cuisine1 {

	

	// Ma méthode main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// J'ai créé 4 nouvelles instances 

		Personne p1 = new Personne();
		Personne p2 = new Personne();

		Verre v1 = new Verre();
		Verre v2 = new Verre();
		
		
		p1.nom = "Laetitia";
		v1.nomVerre = "Gobelet";
		// On nomme notre variable de type liquide
		v1.l.nomLiq = "Sprite";
		v1.l.quantite= 1;
		
		
	}

}
