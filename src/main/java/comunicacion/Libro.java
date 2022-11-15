package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public String getCo_autor() {
		return this.co_autor;
	}
	public void setCo_autor(String co) {
		this.co_autor = co;
	}
	public String getEditorial() {
		return this.editorial;
	}
	public void setEditorial(String ed) {
		this.editorial = ed;
	}
	public String getEdicion() {
		return this.edicion;
	}
	public void setEdicion(String edi) {
		this.edicion = edi;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	@Override
	public int palabrasTotales(int pal) {
		return super.getPaginas()*2;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		return super.getOrigen() + "\n" + super.getTitulo() + "\n"  + super.getAutor() + "\n"  + super.getPaginas() + "\n"  + this.co_autor + "\n"   + this.editorial + "\n"   + this.edicion;
	}
}
