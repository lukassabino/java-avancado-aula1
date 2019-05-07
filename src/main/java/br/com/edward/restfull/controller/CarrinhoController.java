package br.com.edward.restfull.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.controller.ProdutoController;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

	public static final List<ProdutoController> listaCarrinho = new ArrayList<ProdutoController>();

}
