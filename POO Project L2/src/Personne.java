
public class Personne {
	
	protected String nom;
	protected String prenom;
	protected DateDeNaiss D;
	
	//Constructeur Personne : 
	public Personne(String nom , String prenom , DateDeNaiss D )
	{
		this.setNom(nom);
		this.setPrenom(prenom);
		this.D= new DateDeNaiss();
		this.D=D;
		
	}

	public Personne()
	{
		nom=""; 
		prenom="";
		D=new DateDeNaiss();
	}
	
	
	// Getter + Setter nom : 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	// Getter + Setter prenom : 
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setDateDeNaiss(DateDeNaiss D)
	{	
		this.D=D;
	}
	
	public DateDeNaiss getDateDeNaiss()
	{
		return this.D;
	}

	public void description()
	{
		System.out.println("Nom : "+nom);
		System.out.println("Prenom : "+prenom);
		D.description();
	}
	
	public String toString()
	{
		return ( nom +"  "+ prenom +"  "+ D.toString());
	}

}
