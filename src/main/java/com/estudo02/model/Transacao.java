package com.estudo02.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.estudo02.model.enums.StatusTransacao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_transacao")
public class Transacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Debito, Credito, Pre-pago, etc;
	private String tipo;
	
	private String status;
	
	private Float valor;

	public Transacao(Long id, String tipo, StatusTransacao status) {
		super();
		this.id = id;
		this.tipo = tipo;
		setStatus(status.getStatus());
	}
}
