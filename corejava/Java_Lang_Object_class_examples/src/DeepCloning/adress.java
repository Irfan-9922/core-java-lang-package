/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package DeepCloning;

/**
 * NAME:shaikh irfan
 *
 * TIME:12:38:39 pm
 *DATE:14-Nov-2017
 *TAGS:
 */
public class adress implements Cloneable{
	String city="latur";

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected adress clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (adress) super.clone();
	}
}
