package comunicacion;
import java.util.List;

public class Alfabeto extends Pictograma{
	private static List<String> letras;
	private String interpretacion;
	public final char[] letrasAbecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public String letters;
	
	public Alfabeto(String ori, List<String> letr, String inter) {
		super(ori);
		Alfabeto.letras = letr;
		this.interpretacion = inter;
	}
	
	public static List<String> getLetras() {
		return Alfabeto.letras;
	}
	
	public static void setLetras(List<String> le) {
		Alfabeto.letras = le;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String inte) {
		this.interpretacion = inte;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.size();
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	@Override
	public String toString() {
		for (int i = 0; i < 26; i++ ) {
			this.letters = this.letters + letrasAbecedario[i] + ", ";
		}
		return this.letrasAbecedario.toString();
	}
	
	
}