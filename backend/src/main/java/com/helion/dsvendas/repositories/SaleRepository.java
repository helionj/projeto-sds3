package com.helion.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.helion.dsvendas.dtos.SaleSuccessDTO;
import com.helion.dsvendas.dtos.SaleSumDTO;
import com.helion.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
	
	@Query("SELECT new com.helion.dsvendas.dtos.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	

	@Query("SELECT new com.helion.dsvendas.dtos.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
