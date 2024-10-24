package personnages;

public class Ronin extends Humain{
	
	private int honneur ; 

	public Ronin(String nom, int argent, String boisson, int honneur) {
		super(nom, argent,boisson);
		this.honneur = honneur ; 
	}

	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}
	
	void donner(Commerçant beneficiaire) {
		
        int don = getArgent() / 10;
        
    
        perdreArgent(don);
        
        beneficiaire.recevoir(don);
        

        parler("Je donne " + don + " pièces à " + beneficiaire.getNom() + " pour protéger mon honneur.");
        
        augmenterHonneur();
	}
	
	public void augmenterHonneur() {
        honneur++;
        parler("Mon honneur est maintenant de " + honneur + " !");
    }

}
