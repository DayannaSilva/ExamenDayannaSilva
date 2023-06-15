package ec.edu.espe.arquitectura.examendayannasilva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examendayannasilva.model.Institucion;
import java.util.List;



public interface  InstitutoRepository extends JpaRepository<Institucion, Integer>{
      List<Institucion> findByRazonSocialLikeOrderByRazonSocial(String razonSocialPattern);
    
}
