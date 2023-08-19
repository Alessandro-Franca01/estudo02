package com.estudo02.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.estudo02.model.enums.StatusPedido;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_perdido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Float valor;
	
	private List<Cartao> cartoes = new ArrayList<>();
	
	@Column(nullable = false, name = "STATUS")
	private String status;

	public Pedido(Long id, Float valor, StatusPedido status) {
		super();
		this.id = id;
		this.valor = valor;
		setStatus(status.getStatus());
	}
}
