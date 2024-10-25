package Histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.yakuza;
import personnages.Ronin;
public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof",0,"Bierre");
//		prof.setBoisson("Kombucha");
//		prof.gagnerArgent(54);
//		prof.direBonjour();
//		prof.acheter(12, "boisson");
//		prof.boire();
//		prof.acheter(2,"jeu");
//		prof.acheter(50, "Kimono");
//		Commercant Marco = new Commercant("Marco",0,"thé");
//		Marco.direBonjour();
//		Marco.seFaireExtorquer();
//		Marco.recevoir(15);
//		Marco.boire();
		
//		Commercant Marco = new Commercant("Marco",50,"thé");
//		yakuza yaku = new yakuza("yaku le noir",0,"whisky",0,"Nara");
//		yaku.direBonjour();
//		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
//		yaku.extorquer(Marco);
//		int a = Marco.getArgent();
//		Marco.seFaireExtorquer();
//		yaku.parler("J’ai piqué les "+ a + " ce qui me fait " + yaku.getArgent() + "sous dans ma "
//				+ "poche. Hi ! Hi !");
		
		Ronin roro = new Ronin("roro",30);
		yakuza yaku = new yakuza("Yaku le noir",30);
		
		roro.provoquer(yaku);
	}
	
}
