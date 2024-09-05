package application;

public class MenuDeEscolha {

	public static void processarEscolha(int escolha) {
		switch(escolha) {
		case 1:
			escolha = 1;
			break;
		case 2:
			escolha = 2;
			break;
		case 3:
			escolha = 3;
			break;
		case 4:
			escolha = 4;
			break;
		case 5:
			escolha = 5;
			break;
		case 6:
			escolha = 6;
			break;
		default:
			System.out.println("Opção invalida!");
			return;
		}
	}
}
