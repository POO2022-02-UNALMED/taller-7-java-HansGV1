package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fe) {
		this.fecha = fe;
	}
	public String getPrimicia() {
		return this.primicia;
	}
	public void setPrimicia(String pri) {
		this.primicia = pri;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	@Override
	public int palabrasTotales(int pal) {
		return super.getPaginas()*10;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		return super.getOrigen() + "\n" + super.getTitulo() + "\n"  + super.getAutor() + "\n"  + super.getPaginas() + "\n"  + this.fecha + "\n"   + this.primicia;
	}
}