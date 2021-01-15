package com.tonykipchirchir.Zenith.Logistics.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tonykipchirchir.Zenith.Logistics.Models.Location;


@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
