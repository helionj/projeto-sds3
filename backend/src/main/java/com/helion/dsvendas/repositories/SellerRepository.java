package com.helion.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
