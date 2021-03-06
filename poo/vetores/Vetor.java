import java.util.Scanner;

//Vetor Orientado a Objetos
// Rafael Silva Martins
// Rga: 2018.1907.075-1

public class Vetor {
	public int[] v;
	public int n;
	Scanner input;


	public Vetor(int n) { // recebe o tamanho do vetor quando instancia o objeto
		this.n = n;
		v = new int[this.n]; // inicia vetor
		input = new Scanner(System.in);//instanciando objeto da classe Scanner para ler dados do digitados pelo usuario

	}

	public void addVetor(){
		for (int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();
		}
	}

	public static int find(int buscado) {
		int encontrado = -1;

		for (int i = 0; i < v.length; i++) {
			if (v[i] == buscado) {
				encontrado = i;
			}
		}
		return encontrado;
	}

	public static void replace(int buscado, int substituto) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == buscado) {
				v[i] = substituto;
			}
		}
	}

	public static void swap(int a, int b) {
		int aux = 0;
		if (a >= 0 && a < v.length && a >= 0 && a < v.length) {
			aux = v[a];
			v[a] = v[b];
			v[b] = aux;
		} else {
			System.out.println("Posicao Inválida");
		}
	}

	public static void replaceAll(int buscado, int substituto) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == buscado) {
				v[i] = substituto;
			}
		}
	}

	public static void invert() {
		int aux = 0;
		int i = 0;
		int j = v.length - 1;

		while (i <= j) {
			aux = v[i];
			v[i] = v[j];
			v[j] = aux;

			i++;
			j--;
		}

	}

	public static void print() {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}

	public static int produtoEscalar(int[] u) {
		int pEscalar = 0;
		int somaV = 0;
		int somaU = 0;

		for (int w = 0; w < v.length; w++) {
			somaV += v[w];
			somaU += u[w];

		}
		pEscalar = somaV + somaU;
		return pEscalar;
	}

	public static int produtoEscalarVetor(Vetor u) {
		int pEscalar = 0;
		int somaV = 0;
		int somaU = 0;

		for (int w = 0; w < v.length; w++) {
			somaV += u.v[w];
			somaU += v[w];

		}
		pEscalar = somaV + somaU;
		return pEscalar;
	}

	public static void sort() {
		int aux = 0;
		boolean c;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;

				}

			}

		}
	}

}
