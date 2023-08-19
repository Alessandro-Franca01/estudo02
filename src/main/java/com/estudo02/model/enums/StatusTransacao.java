package com.estudo02.model.enums;

public enum StatusTransacao {
	
	ERRO_NOS_DADOS("Erro nos dados do usuário"),
	ERRO_NA_TRANSACAO("Erro ocorrido durante a transação"),
	SALDO_INSUFICIENTE("Saldo do cartão insuficiente"),
	FINALIZADO("Transalçao Finalizada");
	
	private String status;

	private StatusTransacao(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
