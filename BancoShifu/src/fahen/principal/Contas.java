package fahen.principal;

import javax.swing.JOptionPane;

public class Contas {
	
	private int idConta;
	private String jogador;
	private float saldo;
	
	//getters e setters
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	//fim de getters e setters
	
	//operações de conta
	public void deposita(float valor){
		saldo += valor;
	}//fim de valor
	
	public void saca(float valor){
		saldo -= valor;
	}//fim de saca
	
	public void transfere(Contas conta, float valor){
		if(valor > this.saldo){
			JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERRO DE TRANSFERÊNCIA", JOptionPane.INFORMATION_MESSAGE);
		}else{
			saca(valor);
			conta.deposita(valor);
		}//fim de if/else
	}//fim de transfere
	
	//fim das operações de conta

}//fim da classe
