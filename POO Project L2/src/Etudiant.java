
public class Etudiant extends Personne {

	private int matricule;
	static int x=1717310001;
	
	// Constructeur Etdiant : 
	public Etudiant(String nom, String prenom, DateDeNaiss D ) 
	{
		
		super(nom, prenom ,D);
		this.setMatricule(x);
		x++;
	}

	public Etudiant() 
	{
		nom="";
		prenom="";
		D = new DateDeNaiss();
		matricule=0;
	}
	
	
	// Getter + Setter matricule :
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	// Methode toString (Description) :
	public void description()
	{
		System.out.println("Matricule : "+matricule);
		super.description();	
	}
	
	

	public String toString()
	{
		return ( matricule + "  " + super.toString());
	}
	
	
	/*public static void main(String[] args) {
		DateDeNaiss D = new DateDeNaiss(19,01,2000);
		Etudiant e1 = new Etudiant("gnn","rfk",D);
		
		e1.description();
	}*/

	}
