package co.com.swiii.registrotemperatura.historicotemperatura.service.implement;

import co.com.swiii.registrotemperatura.historicotemperatura.converter.HistoricoTemperaturaConverter;
import co.com.swiii.registrotemperatura.historicotemperatura.model.HistoricoTemperatura;
import co.com.swiii.registrotemperatura.historicotemperatura.repository.HistoricoTemperaturaRepository;
import co.com.swiii.registrotemperatura.historicotemperatura.service.HistoricoTemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoTemperaturaServiceImpl implements HistoricoTemperaturaService {

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private HistoricoTemperaturaConverter historicoTemperaturaConverter;

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    private HistoricoTemperaturaRepository historicoTemperaturaRepository;

    @Override
    public void save(HistoricoTemperatura historicoTemperatura) {
        historicoTemperaturaRepository.save(historicoTemperaturaConverter.modelToEntity(historicoTemperatura));
    }

    @Override
    public HistoricoTemperatura findById(Long id) {
        return historicoTemperaturaConverter.entityToModel(historicoTemperaturaRepository.findById(id));
    }

    @Override
    public List<HistoricoTemperatura> findAll() {
        return historicoTemperaturaConverter.entityToModel(historicoTemperaturaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        historicoTemperaturaRepository.deleteById(id);
    }
}
