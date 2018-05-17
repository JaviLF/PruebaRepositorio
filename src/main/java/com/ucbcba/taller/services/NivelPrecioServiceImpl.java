package com.ucbcba.taller.services;


import com.ucbcba.taller.entities.NivelPrecio;
import com.ucbcba.taller.repositories.NivelPrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NivelPrecioServiceImpl implements NivelPrecioService{
    private NivelPrecioRepository nivelPrecioRepository;
    @Autowired
    @Qualifier(value = "nivelPrecioRepository")
    public void setCityRepository(NivelPrecioRepository nivelPrecioRepository) {
        this.nivelPrecioRepository = nivelPrecioRepository;
    }

    @Override
    public Iterable<NivelPrecio> listAllNivelPrecios() {return nivelPrecioRepository.findAll();}

    @Override
    public void saveNivelPrecio(NivelPrecio nivelPrecio){nivelPrecioRepository.save(nivelPrecio);}

    @Override
    public NivelPrecio getNivelPrecio(Integer id){return nivelPrecioRepository.findOne(id);}

    @Override
    public void deleteNivelPrecio(Integer id){nivelPrecioRepository.delete(id);}
}
