package personnages;

public class yakuza extends Humain {
	
	private int reputation = 0; 
	private String clan;
	
	public yakuza(String nom , int argent, String boisson, int reputation,String clan) {
		
		super(nom,argent,boisson);
		
		this.reputation = reputation ; 
		this.clan = clan;
	}
	
	private void gagnerRepuation() {
		reputation++; 
	}
	
	public void perdreRepuation() {
		reputation--; 
	}
	
	public void extorquer(Commerçant victime) {
		int somme = victime.getArgent();
		victime.seFaireExtorquer();
		this.parler(victime +" si tu tien a la vie donne moi cette bourse !");
		this.gagnerArgent(somme);
		this.gagnerRepuation();
	}
	
	

}
