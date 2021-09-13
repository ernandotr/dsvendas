package com.devcompleto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcompleto.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
