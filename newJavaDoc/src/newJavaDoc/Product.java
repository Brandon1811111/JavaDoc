package newJavaDoc;

/**
 * Esta clase se usa para crear objetos "Product" 
 * por medio de atributos y metodos
 * @author Brandon
 *
 */
public class Product {
	private String name;
	private double price;
	private int amount;
	private double total;

	/**
	 * Constructor que crea un objeto "product" recibiendo
	 * 3 parametros (nombre, precio, cantidad)
	 * @param pName
	 * @param pPrice
	 * @param pAmount
	 */
	public Product(String pName, double pPrice, int pAmount){
		this.name =pName;
		this.price=pPrice;
		this.amount=pAmount;
		this.total=(pAmount * pPrice);
	}
	
	/**
	 * Método que retorna el atributo "name", el cuál 
	 * es el nombre del producto
	 * @return - retorna el atributo "name"
	 */
	public String getName(){
		return this.name;
	} 
	
	/**
	 * Método que retorna el atributo "amount", el cuál
	 * es la cantidad de un producto
	 * @return - retorna el atributo "amount"
	 */
	public int getAmount(){
		return this.amount;
	} 

	/**
	 * Método que retorna el atributo "price", el cuál 
	 * es el precio de un producto
	 * @return - retorna el atributo "price"
	 */
	public double getPrice(){
		return this.price;
	} 
	
	/**
	 * Método que retorna el atributo "total", el cuál es
	 * el precio multiplicado por la cantidad
	 * @return - retorna el atributo "total"
	 */
	public double getTotal(){
		return this.total;
	} 
}  