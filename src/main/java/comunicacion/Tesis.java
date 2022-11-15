package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
		return this.idea;
	}
	public void setIdea(String idi) {
		this.idea = idi;
	}
	public String[] getArgumentos() {
		return Tesis.argumentos;
	}
	public void setArugmentos(String[] arg) {
		Tesis.argumentos = arg;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String con) {
		this.conclusion = con;
	}
	public String getReferencias() {
		return this.referencias;
	}
	public void setReferencias(String ref) {
		this.referencias = ref;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	@Override
	public int palabrasTotales(int pal) {
		return super.getPaginas()*pal*5;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		return super.getOrigen() + "\n" + super.getTitulo() + "\n"  + super.getAutor() + "\n"  + super.getPaginas() + "\n" + this.idea + "\n" + Tesis.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
	}
}