package newJavaDoc;
/**
 * Clase principal del proyecto
 * @author Brandon
 */
class Main {

	public static void main(String[] args) {
		Invoice myInvoice = new Invoice();
		myInvoice.addProduct("Café", 999.99, 2);
		myInvoice.addProduct("Filtro", 1500, 1);
    
		myInvoice.getInvoice();
  }
}