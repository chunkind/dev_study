package java_poly_interface;
/* < ������ > 
 * 
 * 
 */
public class Guard {
	public void barkAnimal(Animal animal){
		if(animal instanceof Tiger){
			System.out.println("����!!");
		} else if(animal instanceof Lion){
			System.out.println("������");
		}
	}
	
	public static void main(String[] args) {

	}
}
