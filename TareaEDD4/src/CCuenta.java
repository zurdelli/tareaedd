/**
 * Clase encargada de crear una cuenta y todas sus operaciones
 * 
 * @author moyan
 * @version 1.0
 * @since 1.0
 *
 */
public class CCuenta {

	// Variables de clase - nombre, cuenta, saldo y tipoInteres
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

	/**
	 * Constructor vacio
	 */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase 
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo de cuenta (deprecated)
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Estado (saldo) de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar dinero en la cuenta
     * @param cantidad - cantidad a ingresar
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar dinero de la cuenta
     * @param cantidad - cantidad a retirar
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Getter nombre
     * @return nombre nombre
     * 
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Setter nombre
     * @param nombre nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    /**
     * Getter cuenta
     * @return cuenta cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Setter cuenta
	 * @param cuenta cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Getter saldo
     * @return saldo saldo
     */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setter saldo
	 * @param saldo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Getter tipo interes
     * @return tipoInteres tipo Interes
     */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Setter tipo Interes
	 * @param tipoInteres tipo interes
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
