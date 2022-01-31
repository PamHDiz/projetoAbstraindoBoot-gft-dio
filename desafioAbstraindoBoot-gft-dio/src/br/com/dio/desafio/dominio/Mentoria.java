package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	
	private String titulo;
	private String descri��o;
	private LocalDate data;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo= " + titulo + ", descri��o= " + descri��o + ", data= " + data + "]";
	}
	
	
}
