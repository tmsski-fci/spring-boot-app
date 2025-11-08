package tms.spring_boot_app.repositorios;

import org.springframework.data.repository.CrudRepository;

import tms.spring_boot_app.entidades.Area;

public interface AreaRepo extends CrudRepository<Area, Long> {
    
}
