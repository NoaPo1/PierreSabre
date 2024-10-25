package personnages;

public class yakuza extends Humain {
	
	private int reputation = 0; 
	private String clan;
	
	public yakuza(String nom , int argent) {
		
		super(nom,argent,"wisky");
		
		this.reputation = 1 ; 
		this.clan = "warsong";
	}
	
	private void gagnerRepuation() {
		reputation++; 
	}
	
	public void perdreRepuation() {
		reputation--; 
	}
	
	public void extorquer(Commercant victime) {
		int somme = victime.getArgent();
		victime.seFaireExtorquer();
		this.parler(victime +" si tu tien a la vie donne moi cette bourse !");
		this.gagnerArgent(somme);
		this.gagnerRepuation();
	}

	public int getReputation() {
		return reputation;
	}
	
	public void gagner() {
		this.gagnerRepuation();
		this.parler("Ce ronin pensait vraiment battre "+ this.getNom() +" du clan "+this.clan+"\r\n"+ ""
				+ "Je l'ai dépouillé de ses sous");
	}
	
	public int perdre() { 
		int somme =this.getArgent();
		this.perdreRepuation();
		this.parler("J'ai perdu mais "+ somme + " sous et j'ai dehonore mon clan "+ this.clan);
		return somme;
	}
	


}
