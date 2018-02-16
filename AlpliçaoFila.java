public class AlpliçaoFila{
	public static void main(String args[]){
		Fila fila = new Fila();
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.inserir(40);

		while (!fila.isEmpty() ){
			int x = fila.retirar();
			System.out.println("Retirei o elemento "+x);
		}
		int y = fila.retirar();

	}
}
