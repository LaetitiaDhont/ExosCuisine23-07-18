package package1;

// je cr�e une deuxi�me classe 
class Application {
	
	public static void main(String[] args) {
		// cr�ation d'une instance de la classe cuisine nomm�e "cuisineSimplon" 
		// exemple avec la classe Scanner, c'est exactement la m�me chose
		Cuisine cuisineSimplon = new Cuisine();
		// on veut avoir acc�s � nos variables de la class Cuisine, en l'occurence la tasse
		// le point permet de faire le lien
		cuisineSimplon.tasse = "Mug";
		cuisineSimplon.nom = "Serge";
		cuisineSimplon.prenom ="Janitor";
		
		Cuisine cuisinePierre = new Cuisine();
		cuisinePierre.tasse = "Peter Pan";
		cuisinePierre.nom = "Brogard";
		cuisinePierre.prenom = "Pierre";
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.tasse = "F�e Clochette";
		cuisineAthanasia.nom = "Katsouraki";
		cuisineAthanasia.prenom ="Athanasia";
		
		String retourCafe;
		//On appelle la m�thode machineCafe de l'instance cuisineSimplon de la classe Cuisine et on stock son r�sultat
		retourCafe = cuisineSimplon.machineCafe("Georges Clooney", "EauMG", "Benjamin");
		retourCafe = cuisinePierre.machineCafe("Colombien", "Cristaline", "On");
		retourCafe = cuisineAthanasia.machineCafe("Arabica", "Volvic", "On");
		
	
	}
}