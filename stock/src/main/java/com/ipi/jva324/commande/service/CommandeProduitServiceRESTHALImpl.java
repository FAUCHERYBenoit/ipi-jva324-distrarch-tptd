package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommandeProduitServiceRESTHALImpl implements CommandProduitService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("commade.apiserver.url:http://localhost:8080/")
	private String url;
	
	@Override
	public ProduitEnStock getProduit(long id) {
		return restTemplate.getForObject(url + "api/data-rest/produitEnStocks/" + id, ProduitEnStock.class);
	}
	
}
