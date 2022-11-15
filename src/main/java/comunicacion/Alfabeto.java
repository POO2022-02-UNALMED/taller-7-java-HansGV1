package comunicacion;
import java.util.List;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion;
	public String contenedor;
	
	public Alfabeto(String ori, String[] letr, String inter) {
		super(ori);
		Alfabeto.letras = letr;
		this.interpretacion = inter;
	}
	
	public String[] getLetras() {
		return Alfabeto.letras;
	}
	
	public void setLetras(String[] le) {
		Alfabeto.letras = le;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	@Override
	public String toString() {
		for (int i = 0; i < Alfabeto.letras.length; i++ ) {
			if (i == 0) {
				this.contenedor = Alfabeto.letras[i] + ", ";
			}
			else if(i >= 1 && i < 25){
				this.contenedor = this.contenedor + Alfabeto.letras[i] + ", ";
			}
			else {
				this.contenedor = this.contenedor + Alfabeto.letras[i];
			}
		}
		return this.contenedor.toString();
	}
	
	
}