/**
 * 
 */
package fr.uha.quatre02.biglog.data;

import java.util.Date;

/**
 * @author MaT
 *
 */
public interface BigLogMapperInterface {

	public Integer MapHttpCode();

	public Date MapDate();

	public String MapReferrer();

	public Integer MapBytesSent();

	public String MapUserAgent();

	public Integer MapTotalTime();

	public String MapLocalisation();

}
