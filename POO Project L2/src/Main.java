import java.util.ArrayList;

/* La class de control */ 


public class Main {

	static ArrayList<Etudiant> listeIsil = new ArrayList<Etudiant>();
	static Specialite Isil = new Specialite("ISIL","Math-Info","L2", listeIsil);
	
	static ArrayList<Etudiant> listeAcad = new ArrayList<Etudiant>();
	static Specialite Acad = new Specialite("ACAD","Math-Info","L2", listeAcad);
	
	static ArrayList<Etudiant> listeGtr = new ArrayList<Etudiant>();
	static Specialite Gtr = new Specialite("GTR","Math-Info","L2", listeGtr);
	
	static ArrayList<Etudiant> toutEtd = new ArrayList<Etudiant>();
	 
	static ArrayList<Enseignant> listeEns = new ArrayList<Enseignant>();
	
	static DateDeNaiss d = new DateDeNaiss();
	
	static Enseignant ensIsil = new Enseignant(" "," ",d," "," ",0,Isil);
	
	static Enseignant ensAcad = new Enseignant(" "," ",d," "," ",0,Acad);
	
	static Enseignant ensGtr = new Enseignant(" "," ",d," "," ",0,Gtr);
	
	public boolean anneeBis(int a)
	{
		if( a%4==0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public boolean anneeExiste( int a)
	{
		if( a<1950 || a>2019 )
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean testDate(int j,int m,int a)
	{
		if ( anneeExiste(a)==false)
		{
			return false;
		}
		
		if( j<1 || j>31 )
		{
			return false;
		}
		
		if( m<1 || m>12)
		{
			return false;	
		}
		
		if( (j==30 && m==2) || ( j==31 && m==2 ) )
		{
			return false;
		}
		
		if( (j==31 && m==4) || (j==31 && m==6) || (j==31 && m==9) || (j==31 && m==11) )
		{
			return false;
		}
		
		if ( j==29 && m==2 && anneeBis(a)==false )
		{
			return false;
		}
		
		
		return true;
	}
	
	public boolean alphabet(char c)
	{
		boolean v=false;
		char a='a'; 
		char A='A';
		while( (a<='z') && (v==false) )
		{
			if(c==a)
			{
				v=true;
			}
			a++;
		}
		while( (A<='Z') && (v==false) )
		{
			if(c==A)
			{
				v=true;
			}
			A++;
		}
		return v;
	}

	public boolean num(char c)
	{
		boolean v=false;
		char i='0'; 
		while( (i<='9') && (v==false) )
		{
			if(c==i)
			{
				v=true;
			}
			i++;
		}
		return v;
	}

	
	public boolean textOnly(String s)
	{
		for(int i=0; i<s.length();i++)
		{
			if( !alphabet(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean numbersOnly(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if( !num(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
	
	//ArrayList<Etudiant> listeIsil = new ArrayList<Etudiant>();
	//ArrayList<Etudiant> listeAcad = new ArrayList<Etudiant>();
	//ArrayList<Etudiant> listeGtr = new ArrayList<Etudiant>();

  
    /*
	public static void main(String[] args) {
		
		

	}
*/



}
