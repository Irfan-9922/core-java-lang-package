/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package DeepCloning;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:11:53 pm
 *DATE:14-Nov-2017
 *TAGS:
 */
public class hobbey implements Cloneable{
	private String h ="cricket";

	/**
	 * @param h
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public hobbey clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (hobbey) super.clone();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "hobbey [h=" + h + "]";
	}

}