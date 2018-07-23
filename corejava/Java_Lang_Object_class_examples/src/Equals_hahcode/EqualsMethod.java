/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package Equals_hahcode;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:48:27 am
 *DATE:14-Nov-2017
 *TAGS:
 */
public class EqualsMethod {
	private String name;
	private int id;
	/**
	 * @param name
	 * @param id
	 */
	public EqualsMethod(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		/*
		 * this satatemente use if the current object and argument obj are same
		 * the below line used for refrence compareison
		 */
	
		if(this==obj){
			return true;
		}else{
			if(obj instanceof EqualsMethod){
				EqualsMethod e=(EqualsMethod) obj;
				return this.id==e.id && this.name.equals(e.name);
			}
			else{
				return false;
			}
		}
		
		
	
		
		/*
		 * the below statement used to compare object based onm the state
		 * 
		 */
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return id;
	}
	public int hh(){
		return super.hashCode();
	}
	public static void main(String[] args) {
		EqualsMethod m=new EqualsMethod("irfan", 1);
		EqualsMethod m1=new EqualsMethod("irfan", 1);
		//m1=null;
		System.out.println(m1.equals(m));
		System.out.println( m1.hashCode());
		System.out.println(System.identityHashCode(m1));
	
	}

}
