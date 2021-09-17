package com.supra.trapApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supra.trapApp.model.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long>{

}