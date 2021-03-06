/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package Sallow_Clone;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:47:18 am
 *DATE:14-Nov-2017
 *TAGS:
 */
public class CloneExample implements Cloneable{
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CloneExample [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	private int id;
	private String name;
	private Adress a;
	private Object s;
	/**
	 * @param id
	 * @param name
	 * @param a
	 */
	public CloneExample(int id, String name, Adress a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
	/**
	 * @param id
	 * @param name
	 */
	public CloneExample(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Adress a=new Adress("pune");
		
		CloneExample f=new CloneExample(1,"irfan",a);
		CloneExample s=(CloneExample) f.clone();
		/*
		 * for displaying data 
		 */
		System.out.println(f);
		System.out.println(s);
		/*
		 * below line is used for idnetifing both object are 
		 * pointing to the same adress refrence
		 * if both are pointing to thae same object then returns true
		 * elae return false
		 */
		System.out.println(f.a==s.a);
		System.out.println(f.a.hashCode());
		System.out.println(s.a.hashCode());
		
	}
	
	

}
