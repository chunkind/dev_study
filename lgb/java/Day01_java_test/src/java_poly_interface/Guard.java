package java_poly_interface;
/* < ¥Ÿ«¸º∫ > 
 * 
 * 
 */
public class Guard {
	public void barkAnimal(Animal animal){
		if(animal instanceof Tiger){
			System.out.println("æÓ»Ô!!");
		} else if(animal instanceof Lion){
			System.out.println("¿∏∏£∑∑");
		}
	}
	
	public static void main(String[] args) {

	}
}
