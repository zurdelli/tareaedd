/**
 * Clase principal, encargada de realizar las operaciones de la cuenta
 * 
 * @author moyano
 * @version 1.0
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
    	// Cuenta en la que operar
        CCuenta cuenta1;
        // saldo actual
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        /**
         * Operacion de la cuenta
         */
        operativa_cuenta(cuenta1, saldoActual);
    }

    /**
     * Operativa cuenta se encarga de retirar una cantidad introducida por parametro
     * y de ingresar una cantidad fija (695)
     * @param cuenta1 cuenta en la que operar
     * @param saldoActual cantidad a operar
     */
	private static void operativa_cuenta(CCuenta cuenta1, double saldoActual) {
		try {
            cuenta1.retirar(saldoActual);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
