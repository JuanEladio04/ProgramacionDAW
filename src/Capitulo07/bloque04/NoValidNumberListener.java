package Capitulo07.bloque04;

public interface NoValidNumberListener {
	
	public void resultSmallerThan0(NoValidNumberEvent e);
	
	public void resultBiggerThan1000(NoValidNumberEvent e);
	
	public void numberEqualThan0();

}
