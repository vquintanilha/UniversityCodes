import java.util.Comparator;

public class ComparaPorSalario implements Comparator<Empregado> {

	@Override
	public int compare(Empregado o1, Empregado o2) {
		return o1.getValorAPagar().compareTo(o2.getValorAPagar());
	}

}
