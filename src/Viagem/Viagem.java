public class Viagem{
	private Passageiro passageiro;
	private Motorista motorista;
	private String origem;
	private String destino;
	private double precoCorrida;

	public Viagem(Passageiro passageiro, Motorista motorista){
		passageiro = new Passageiro();
		
	}

	public String getNomePassageiro(){
		return passageiro.getNome();

	}

	public String getNomeMotorista(){
		

	}

	public String getPlacaCarro(){


	}

	public String getOrigemCorrida(){
		return origem;

	}

	public String getDestinoCorrida(){
		return destino;

	}

	public void setOrigemCorrida(String origem){

	}

	public void setDestinoCorrida(String destino){

	}

	public void imprimeInformacoesCorrida(){

	}
}