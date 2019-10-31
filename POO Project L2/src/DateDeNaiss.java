
public class DateDeNaiss {
	
	private int jDeNaiss ;
	private int mDeNaiss ;
	private int aDeNaiss ;

	public DateDeNaiss()
	{
		jDeNaiss=0;
		mDeNaiss=0;
		aDeNaiss=0;	
	}
	
	public DateDeNaiss(int jDeNaiss , int mDeNaiss , int aDeNaiss)
	{
		this.jDeNaiss=jDeNaiss;
		this.mDeNaiss=mDeNaiss;
		this.aDeNaiss=aDeNaiss;	
	}
	
	
	public int getjDeNaiss() {
		return jDeNaiss;
	}
	public void setjDeNaiss(int jDeNaiss) {
		this.jDeNaiss = jDeNaiss;
	}
	
	public int getmDeNaiss() {
		return mDeNaiss;
	}
	public void setmDeNaiss(int mDeNaiss) {
		this.mDeNaiss = mDeNaiss;
	}
	
	public int getaDeNaiss() {
		return aDeNaiss;
	}
	void setaDeNaiss(int aDeNaiss) {
		this.aDeNaiss = aDeNaiss;
	}

	public DateDeNaiss getDate()
	{
		DateDeNaiss d = new DateDeNaiss(this.jDeNaiss,this.mDeNaiss,this.aDeNaiss);
		return d;
		
	}
	
	public void description ()
	{
		System.out.println("Date de naissance : "+jDeNaiss+" / "+mDeNaiss+" / "+aDeNaiss);
	}
	
	public String toString()
	{
		return ( jDeNaiss+"/"+mDeNaiss+"/"+aDeNaiss+" " );
	}
	
	
/*	public static void main(String[] args) {
		DateDeNaiss D = new DateDeNaiss(19,01,2000);
		D.description();
	}*/

}
