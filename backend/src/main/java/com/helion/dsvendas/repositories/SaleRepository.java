package com.helion.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
