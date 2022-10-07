package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoSistema {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("Sua tela tem resolução de " + d.width + " x " + d.height);

	}

}
