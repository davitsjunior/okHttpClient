package com.okhttpteste.domain.entity;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

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

	public Produto(Integer id, String name, long ibu, double preco) {
		this.id = id;
		this.name = name;
		this.ibu = ibu;
		this.preco = preco;
	}

}
