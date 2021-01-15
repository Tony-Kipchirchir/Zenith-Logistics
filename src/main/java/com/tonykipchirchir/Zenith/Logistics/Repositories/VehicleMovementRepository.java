package com.tonykipchirchir.Zenith.Logistics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonykipchirchir.Zenith.Logistics.Models.VehicleMovement;


@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
