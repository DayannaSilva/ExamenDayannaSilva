package ec.edu.espe.arquitectura.examendayannasilva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examendayannasilva.model.Edificio;
import ec.edu.espe.arquitectura.examendayannasilva.model.Sede;


public interface  SedeRepository extends JpaRepository<Sede, String>{
     List<Edificio> findBySedeLikeOrderByInsituto(String nombre , Integer codigo);

    
}

