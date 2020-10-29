package co.com.swiii.registrotemperatura.historicotemperatura.controller;


import co.com.swiii.registrotemperatura.historicotemperatura.converter.HistoricoTemperaturaConverter;
import co.com.swiii.registrotemperatura.historicotemperatura.model.HistoricoTemperatura;
import co.com.swiii.registrotemperatura.historicotemperatura.service.HistoricoTemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historicotemperatura")
public class HistoricoTemperaturaController {

    @Autowired
    HistoricoTemperaturaService historicoTemperaturaService;
    @Autowired
    HistoricoTemperaturaConverter historicoTemperaturaConverter;

    @PostMapping("/historicotemperatura")
    public void save(@RequestBody HistoricoTemperatura historicoTemperatura) {
        historicoTemperaturaService.save(historicoTemperatura);
    }

    @GetMapping("/{id}/historicotemperatura")
    public HistoricoTemperatura findByID(@PathVariable(value = "id", required = true) Long id) {
        return historicoTemperaturaService.findById(id);
    }

    @GetMapping("/historicotemperatura")
    public List<HistoricoTemperatura> findAll() {
        return historicoTemperaturaService.findAll();
    }

    @DeleteMapping("/{id}/historicotemperatura")
    public void deleteById(@PathVariable(value = "id", required = true) Long id) {
        historicoTemperaturaService.deleteById(id);
    }
}
