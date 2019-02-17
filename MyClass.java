import javax.swing.JOptionPane;

public class MyClass {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt( JOptionPane.showInputDialog( "Informe um número de 0 a 10: ") );

		if( numero1 == 0  ) {
			System.out.println("deu erro");
			System.exit(0);
		}

		if( numero1 > 10 ) {
			System.out.println("Gentileza informar um número de 0 a 10");
			System.exit(0);
		}
		
		Integer numeroDigitado = Integer.valueOf(numero1);

		for( Integer i=1; i<=numeroDigitado; i++ ) {
			for( Integer x=1; x<=i; x++ ) {
				System.out.print(i);
			}
			System.out.println();
	    }
	}

}
