package personnages;

public class Humain {
	
	private String nom;
	
	private int argent;
	
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public String getBoisson() {
		return boisson;
	}
	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	
	public void gagnerArgent(int argent) {
		this.argent = this.argent + argent;
	}
	
	public void perdreArgent(int argent) {
		this.argent = this.argent - argent;
	}
	
	public void parler(String Texte) {
		System.out.println(Texte);
	}
	
	public void direBonjour() {
		parler("Bonjours ! Je m'appelle " + getNom() + "et j'aime boire du " + getBoisson() );
	}
	
	public void boire () {
		parler("Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !");
	}
	
	public void acheter(int prix , String objet) {
		if (getArgent() > prix) {
			parler("j'ai " + getArgent() + " sous en poche.Je vais pouvoir m'offrir une "+ objet +" à "+ prix +" sous");
			this.perdreArgent(prix);
		}
		else {
			parler("Je n'ai que "+ getArgent() + " je ne peux pas achet "+ objet + " A "+ prix );
		}
			
	}
}

