import com.sas.util.SasPasswordEncodingException;
import com.sas.util.SasPasswordString;

/**
 * 
 */

/**
 * @author sbxddd
 *
 */
public class SASProprietary {

	/**
	 * 
	 */
	public SASProprietary() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws SasPasswordEncodingException 
	 */
	public static void main(String[] args) {
		String decode = null;
		try {
			decode = SasPasswordString.decode("{sas002}A15F8F564DCAC7AF2B16988956FB1EFA2DF03237");
		} catch (SasPasswordEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(decode);

	}
}
