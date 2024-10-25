package personnages;

public class Ronin extends Humain{
	
	private int honneur ; 

	public Ronin(String nom, int argent) {
		super(nom, argent,"sochu");
		this.honneur = 1 ; 
	}

	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		
        int don = getArgent() / 10;
        
    
        perdreArgent(don);
        
        beneficiaire.recevoir(don);
        

        parler("Je donne " + don + " pièces à " + beneficiaire.getNom() + " pour protéger mon honneur.");
        
        augmenterHonneur();
	}
	
	private void augmenterHonneur() {
        honneur++;
        parler("Mon honneur est maintenant de " + honneur + " !");
    }
	
	private void gagner() {
		this.parler("Je t'ai eu petit yakuza");
		this.augmenterHonneur();
	}
	
	private int perdre() {
		int somme = this.getArgent();
		this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
		return somme; 
	}
	
	public void provoquer(yakuza yaku) {
		int force = this.getHonneur() * 2 ;
		this.parler("- Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait � ce pauvre\r\n"
				+ "marchand!");
		if ( force >= yaku.getReputation()) {
			this.gagner();
			yaku.perdreRepuation();
			int gain = yaku.perdre();
			this.gagnerArgent(gain);
		}
		else if (force <= yaku.getReputation()) {
			int gain = this.perdre();
			yaku.gagner();
			yaku.parler("merci pour "+ gain + " sous");
			yaku.gagnerArgent(gain);
		}
		
	}
}
