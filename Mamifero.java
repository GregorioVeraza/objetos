package ar.edu.unlp.info.oo1.ejercicio3;

public class Mamifero {
	private Mamifero Padre;
	private Mamifero Madre;
	private String identificador;
	private String especie;
	public Mamifero() {
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	public Mamifero getPadre() {
		return Padre;
	}
	public void setPadre(Mamifero padre) {
		Padre = padre;
	}
	public Mamifero getMadre() {
		return Madre;
	}
	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Mamifero getAbueloMaterno()
	{
		if ((this.getPadre() !=null) && (this.getMadre() != null)) {
			return this.getMadre().getPadre();
			} else {
				return null;
			}
		
	}
	public Mamifero getAbueloPaterno()
	{
		if ((this.getPadre() !=null) && (this.getMadre() != null)) {
			return this.getPadre().getPadre();
			} else {
				return null;
			}
		
	}
	public Mamifero getAbuelaMaterna()
	{
		if ((this.getPadre() !=null) && (this.getMadre() != null)) {
			return this.getMadre().getMadre();
			} else {
				return null;
			}
		
	}
	
	public Mamifero getAbuelaPaterna()
	{
		if ((this.getPadre() !=null) && (this.getMadre() != null)) {
		return this.getPadre().getMadre();
		} else {
			return null;
		}
	}
	private boolean esHoja(Mamifero m) {
		boolean es = true;
		if ((m.getPadre() != null) && (m.getMadre() != null)) {
			es = false;
		}
		return es;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean encontre = false;
			if ((this.getPadre() != null)){
				if (this.getPadre().equals(unMamifero)) {
					encontre  = true;
				}
				else {
					encontre = this.getPadre().tieneComoAncestroA(unMamifero);
				}
			}
			if ((this.getMadre() != null) && !encontre) {
				if (this.getMadre().equals(unMamifero)) {
					encontre = true;
				} else {
					encontre =  this.getMadre().tieneComoAncestroA(unMamifero);
				}
			}
			return encontre;
	}
	
}
