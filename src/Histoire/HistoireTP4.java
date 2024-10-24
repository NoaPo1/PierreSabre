package Histoire;
import personnages.Humain;
public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof",0,"Bierre");
		prof.setBoisson("Kombucha");
		prof.gagnerArgent(54);
		prof.direBonjour();
		prof.acheter(12, "boisson");
		prof.boire();
		prof.acheter(2,"jeu");
		prof.acheter(50, "Kimono");
	}
	
}
