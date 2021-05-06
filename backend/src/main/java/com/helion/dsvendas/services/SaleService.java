package com.helion.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helion.dsvendas.dtos.SaleDTO;
import com.helion.dsvendas.entities.Sale;
import com.helion.dsvendas.repositories.SaleRepository;
import com.helion.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		
		sellerRepository.findAll();
		Page<Sale> result = repo.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x));
		
	}
	

}
