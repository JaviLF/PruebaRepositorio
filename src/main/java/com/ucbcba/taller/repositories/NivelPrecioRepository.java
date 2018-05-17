package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.NivelPrecio;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface NivelPrecioRepository extends CrudRepository<NivelPrecio,Integer>{
}
