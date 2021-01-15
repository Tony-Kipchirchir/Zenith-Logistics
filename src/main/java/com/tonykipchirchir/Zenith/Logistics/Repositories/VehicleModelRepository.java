package com.tonykipchirchir.Zenith.Logistics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonykipchirchir.Zenith.Logistics.Models.VehicleModel;



@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
