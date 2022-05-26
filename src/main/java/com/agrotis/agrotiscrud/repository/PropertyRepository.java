package com.agrotis.agrotiscrud.repository;

import com.agrotis.agrotiscrud.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
