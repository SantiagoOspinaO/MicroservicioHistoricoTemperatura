package co.com.swiii.registrotemperatura.historicotemperatura.service;



import co.com.swiii.registrotemperatura.historicotemperatura.model.HistoricoTemperatura;

import java.util.List;

public interface HistoricoTemperaturaService {

    void save(HistoricoTemperatura historicoTemperatura);
    HistoricoTemperatura findById(Long id);
    List<HistoricoTemperatura> findAll();
    void deleteById(Long id);
}
