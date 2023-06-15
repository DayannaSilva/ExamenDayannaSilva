package ec.edu.espe.arquitectura.examendayannasilva.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.espe.arquitectura.examendayannasilva.model.Edificio;
import java.util.List;

public interface  EdificioRepository extends JpaRepository<Edificio, String>{
      List<Edificio> findByNombreLikeOrderBySuperficie(String nombre , Integer superficie);



}