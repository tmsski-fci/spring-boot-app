package tms.spring_boot_app.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tms.spring_boot_app.entidades.Area;
import tms.spring_boot_app.repositorios.AreaRepo;

@RestController
public class AreaControle {
    
    @Autowired
    private AreaRepo areaRepo;

    @GetMapping("/api/areas")
    public Iterable<Area> consultar() {
        return areaRepo.findAll();
    }

    @SuppressWarnings("null")
    @PostMapping("/api/areas")
    public Area criar(@RequestBody Area area) {
        return areaRepo.save(area);
    }
}
