package newJavaDoc;
import java.util.ArrayList;

/**
 * Esta clase se usa para crear objetos "Invoice"
 * por medio de atributos y m�todos
 * @author Brandon
 *
 */
public class Invoice {
  
	ArrayList<Product> products = new ArrayList<>();

	/**
	 * M�todo que crea y a�ade un objeto "product" 
	 * a la lista "products"
	 * @param pName
	 * @param pPrice
	 * @param pAmount
	 */
	public void addProduct(String pName, double pPrice, int pAmount){
		Product nextProduct = new Product(pName, pPrice, pAmount);
		this.products.add(nextProduct);
	}
	/**
	 * M�todo que suma el atributo "total" de 
	 * todos los objetos de la lista "products"
	 * @return - retorna el monto total
	 */
	private double realTotal(){
		double total = 0;
		for(int i = 0; i < products.size() ;i++){
			total += products.get(i).getTotal();
		}
		return total;
	}
  
	/**
	 * M�todo que imprime en un formato espec�fico
	 * el objeto "Invoice"
	 */
	public void getInvoice(){
		System.out.println("Nombre  Cantidad     Precio          Total");
		for(int i = 0; i < products.size() ;i++){
			System.out.printf("%s      %d       %.6f       %.6f%n" ,products.get(i).getName(),products.get(i).getAmount(),products.get(i).getPrice(), products.get(i).getTotal() );
		}
		System.out.printf("\t\t\t\t\t\t\t\t\t\t %.2f%n",this.realTotal());
	}
}
