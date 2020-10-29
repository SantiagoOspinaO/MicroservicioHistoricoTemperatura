package co.com.swiii.registrotemperatura.historicotemperatura.repository;

import co.com.swiii.registrotemperatura.historicotemperatura.entity.HistoricoTemperaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoTemperaturaRepository extends JpaRepository<HistoricoTemperaturaEntity, Long> {

}
