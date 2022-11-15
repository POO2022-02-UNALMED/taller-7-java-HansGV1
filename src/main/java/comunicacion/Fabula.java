package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return this.ensenanza;
	}
	public void setEnsenanza(String en) {
		this.ensenanza = en;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	@Override
	public int palabrasTotales(int pal) {
		return super.getPaginas()*1;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		return super.getOrigen() + "\n" + super.getTitulo() + "\n"  + super.getAutor() + "\n"  + super.getPaginas() + "\n"  + this.ensenanza ;
	}
}