

public class Enseignant extends Personne {

	private String module;
	private String grade;
	
	// spacialite a ne pas oublier 
	private int hDeTravail;
	public Specialite spec;
	
	

	// Constructeur Enseignant : 
	public Enseignant(String nom, String prenom, DateDeNaiss D, String module , String grade ,int hDeTravail ,Specialite spec) {
		super(nom, prenom ,D);
		this.setModule(module);
		this.setGrade(grade);
		this.sethDeTravail(hDeTravail);
		this.spec =new Specialite();
		this.spec=spec;	
	}
	
	public Enseignant()
	{
		
	}


    // Getter + Setter module : 
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}

	// Getter + Setter grede :
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	// Getter + Setter hDeTravail (heures de travail) :  
	public int gethDeTravail() {
		return hDeTravail;
	}
	public void sethDeTravail(int hDeTravail) {
		this.hDeTravail = hDeTravail;
	}

	
	
	
	// Methode (Description) :
	public void description()
	{
		super.description();
		System.out.println("Module : "+module);
		System.out.println("Grede : "+grade);
		System.out.println("Heures de travail : "+hDeTravail);
		spec.description();

	}
	
	public String toString()
	{
		return ( super.toString() +" | " + spec.getNom()+" | "+ module+" | "+grade+" | "+hDeTravail+"H   "+"\n" );
	}
	
	
	
}
