package personnages;

public class Commercant extends Humain{
	public Commercant(String nom, int argent) {
		super(nom,argent,"the");
		
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

