package br.com.edward.restfull.model;

import java.util.List;

public class CarrinhoModel {

	private final List<ItemCarrinhoModel> itens;

	public CarrinhoModel(List<ItemCarrinhoModel> itens) {
		this.itens = itens;
	}

	public Double getTotal() {
		Double totalItens = 0.0;
		for (ItemCarrinhoModel item : itens) {
			totalItens += item.getTotal();
		}
		return totalItens;
	}

}
