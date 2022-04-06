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
	 * M�todo que retorna el atributo "name", el cu�l 
	 * es el nombre del producto
	 * @return - retorna el atributo "name"
	 */
	public String getName(){
		return this.name;
	} 
	
	/**
	 * M�todo que retorna el atributo "amount", el cu�l
	 * es la cantidad de un producto
	 * @return - retorna el atributo "amount"
	 */
	public int getAmount(){
		return this.amount;
	} 

	/**
	 * M�todo que retorna el atributo "price", el cu�l 
	 * es el precio de un producto
	 * @return - retorna el atributo "price"
	 */
	public double getPrice(){
		return this.price;
	} 
	
	/**
	 * M�todo que retorna el atributo "total", el cu�l es
	 * el precio multiplicado por la cantidad
	 * @return - retorna el atributo "total"
	 */
	public double getTotal(){
		return this.total;
	} 
}  