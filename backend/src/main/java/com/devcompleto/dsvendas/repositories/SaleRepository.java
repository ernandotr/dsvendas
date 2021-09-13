package com.devcompleto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcompleto.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
