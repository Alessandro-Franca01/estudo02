package com.estudo02.model.enums;

public enum StatusPedido {
	
	CANCELADO_PELO_USUARIO("Cancelado pelo Usuário"),
	CANCELADO_PELO_SISTEMA("Cancelado pelo Sistema"),
	AGUARDADNO_PAGAMENTO("Pendente"),
	EFETUADO("Efetuado");
	
	private String status;

	private StatusPedido(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
