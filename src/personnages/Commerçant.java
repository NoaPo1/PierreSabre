package personnages;

public class Commerçant extends Humain{
	public Commerçant(String nom, int argent, String boisson) {
		super(nom,argent, boisson);
		
	}
	
	public int seFaireExtorquer() {
		int a = this.getArgent();
		this.perdreArgent(getArgent());
		parler("Le monde est injuste");
		return a;	 
	}
	
	public void recevoir(int argent){
		this.gagnerArgent(argent);
		parler("Merci pour les "+ argent + " pièce");
		
	}
	
	

}
