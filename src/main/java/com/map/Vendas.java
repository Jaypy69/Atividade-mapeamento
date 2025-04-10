package com.map;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="venda")
public class Vendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int númerovenda;
	private Date data;
	
	@ManyToOne
	@JoinColumn(name="pessoaf_id")
	private Pessoaf pessoaf;
	
	@ManyToOne
	@JoinColumn(name="pessoaj_id")
	private Pessoaj pessoaj;
}
