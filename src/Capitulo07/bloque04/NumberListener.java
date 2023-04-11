package Capitulo07.bloque04;

public class NumberListener extends Object implements NoValidNumberListener{
	
	/**
	 * 
	 */
	public NumberListener () {
		Calculator.addNumberListener(this);
	}

	@Override
	public void resultSmallerThan0(NoValidNumberEvent e) {
		System.out.println("El numero es menor que 0.");
		
	}

	@Override
	public void resultBiggerThan1000(NoValidNumberEvent e) {
		System.out.println("El resultado es mayor a 1000: " + e.getNumber());
		
	}

	@Override
	public void numberEqualThan0() {
		System.out.println("El divisor es igual a 0");
		
	}

}
