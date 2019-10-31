
import java.util.ArrayList;

public class Specialite {

	private String nom;
	private String filiere;
	private String aEtudes;
	ArrayList<Etudiant> listeEtd ;// = new ArrayList<>();
	int i;
	
	
	// Constructeur Specialite : 
	public Specialite(String nom , String filiere ,String aEtudes , ArrayList<Etudiant> listeEtd)
	{
		this.setNom(nom);
		this.setFiliere(filiere);
		this.setaEtudes(aEtudes);
		listeEtd = new ArrayList<Etudiant>();
			
	}
	 
	public Specialite()
	{
		nom="";
		filiere="";
		aEtudes="";
		listeEtd = new ArrayList<Etudiant>();	
			
	}
	
	// Fonction qui ajoute un etudiant 
	public void ajouterEtudiant(Etudiant E)
	{
		this.listeEtd.add(E);
	}
	
	// Fonction pour avoir un etudiant 
	public Etudiant accesEtudiant(int i)
	{
		return (Etudiant)(this.listeEtd.get(i));
	}
	
	// Getter + Setter nom :
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Getter + Setter filiere
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	
	// Getter + Setter annee d'etudes : 
	public String getaEtudes() {
		return aEtudes;
	}
	public void setaEtudes(String aEtudes) {
		this.aEtudes = aEtudes;
	}
	
	public  void afficheListeEtd (ArrayList<Etudiant> listeEtd)
	{
		int i;
		for(i=0;i<listeEtd.size();i++)
		{
			//System.out.println("  Etudiant num° "+(i+1));
			listeEtd.get(i).description();
			System.out.println("");
		}
	}
	
	public void description()
	{
		System.out.println("Nom de specialité : "+nom);
		System.out.println("Filiere : "+filiere);
		System.out.println("Année d'etudes : "+aEtudes);
		System.out.println("La liste des etudiants :");
		afficheListeEtd(listeEtd);
	}
	

	public String toString() 
	{
		return ( nom+" "+filiere+" "+aEtudes+" \n"+listeEtd );
	}
	
	
	/*public static void main(String[] args) {
		
		DateDeNaiss D = new DateDeNaiss(19,01,2000);
		Etudiant e1 = new Etudiant("gnn","rfk",D);
		
		DateDeNaiss D2 = new DateDeNaiss(26,12,1999);
		Etudiant e2 = new Etudiant("smr","tma",D2);
		Etudiant e3 = new Etudiant();
		
		ArrayList<Etudiant> l = new ArrayList<Etudiant>();
		//l.add(e1); l.add(e2);
		
		//l.add(e3);
		//e3=l.get(0);
		
		
	
		Specialite s = new Specialite("M-I","ISIL","2019",l);
		s.ajouterEtudiant(e1);
		s.ajouterEtudiant(e2);
		//s.description();
		
		e3=s.accesEtudiant(0);
		e3.toString();
		
		
		
	}*/
} 
