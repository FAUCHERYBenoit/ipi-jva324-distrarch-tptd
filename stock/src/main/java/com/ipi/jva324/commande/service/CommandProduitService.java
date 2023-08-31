package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;

public interface CommandProduitService {
	
	ProduitEnStock getProduit(long id);

}
