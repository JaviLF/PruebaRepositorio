package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.NivelPrecio;

public interface NivelPrecioService {
    Iterable<NivelPrecio> listAllNivelPrecios();

    void saveNivelPrecio(NivelPrecio nivelPrecio);

    NivelPrecio getNivelPrecio(Integer id);

    void deleteNivelPrecio(Integer id);

}
