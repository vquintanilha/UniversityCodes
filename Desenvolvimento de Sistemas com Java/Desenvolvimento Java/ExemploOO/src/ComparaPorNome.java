import java.util.Comparator;

public class ComparaPorNome implements Comparator<Empregado> {

	@Override
	public int compare(Empregado o1, Empregado o2) {
		return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
	}

}
