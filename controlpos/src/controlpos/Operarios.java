/**
 * 
 */
package controlpos;

/**
 * @author user
 *
 */
public class Operarios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		DescargaDeSoftware descargaDeSoftware = new DescargaDeSoftware ();
		String resultado=descargaDeSoftware.buscasoftware("samsung");
		
		System.out.println("la vercion de software: "+ resultado);

	}
	



}
