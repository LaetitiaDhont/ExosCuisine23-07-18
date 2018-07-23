package package1;

// je crée une deuxième classe 
class Application {
	
	public static void main(String[] args) {
		// création d'une instance de la classe cuisine nommée "cuisineSimplon" 
		// exemple avec la classe Scanner, c'est exactement la même chose
		Cuisine cuisineSimplon = new Cuisine();
		// on veut avoir accès à nos variables de la class Cuisine, en l'occurence la tasse
		// le point permet de faire le lien
		cuisineSimplon.tasse = "Mug";
		cuisineSimplon.nom = "Serge";
		cuisineSimplon.prenom ="Janitor";
		
		Cuisine cuisinePierre = new Cuisine();
		cuisinePierre.tasse = "Peter Pan";
		cuisinePierre.nom = "Brogard";
		cuisinePierre.prenom = "Pierre";
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.tasse = "Fée Clochette";
		cuisineAthanasia.nom = "Katsouraki";
		cuisineAthanasia.prenom ="Athanasia";
		
		String retourCafe;
		//On appelle la méthode machineCafe de l'instance cuisineSimplon de la classe Cuisine et on stock son résultat
		retourCafe = cuisineSimplon.machineCafe("Georges Clooney", "EauMG", "Benjamin");
		retourCafe = cuisinePierre.machineCafe("Colombien", "Cristaline", "On");
		retourCafe = cuisineAthanasia.machineCafe("Arabica", "Volvic", "On");
		
	
	}
}