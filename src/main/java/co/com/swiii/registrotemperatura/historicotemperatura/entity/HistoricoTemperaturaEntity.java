package co.com.swiii.registrotemperatura.historicotemperatura.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="historicotemperatura")
public class HistoricoTemperaturaEntity {

    @Id
    @GeneratedValue
    @Column(name="idHistoricoTemperatura")
    private Long idHistoricoTemperatura;

    @Column(name="fechaMuestreo")
    private Date fechaMuestreo;

    @Column(name="temperatura")
    private double temperatura;

}
