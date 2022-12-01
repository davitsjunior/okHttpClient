package com.okhttpteste.domain.entity;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public class Produto {

	private Integer id;
	private String name;
	private long ibu;
	private double preco;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIbu() {
		return ibu;
	}

	public void setIbu(long ibu) {
		this.ibu = ibu;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto(String name, long ibu, double preco) {

		this.name = name;
		this.ibu = ibu;
		this.preco = preco;
	}

}
