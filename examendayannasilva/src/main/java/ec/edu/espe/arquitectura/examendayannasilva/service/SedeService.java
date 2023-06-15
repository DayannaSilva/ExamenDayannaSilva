package ec.edu.espe.arquitectura.examendayannasilva.service;
import ec.edu.espe.arquitectura.examendayannasilva.repository.SedeRepository;
import ec.edu.espe.arquitectura.examendayannasilva.model.Sede;
import java.util.Optional;
import jakarta.transaction.Transactional;


public class SedeService {

    private final SedeRepository sedeRepository;

    public SedeService(SedeRepository  sedeRepository) {
        this.sedeRepository = sedeRepository;
    }
       public Optional<Sede> obtainByCode(String code) {
        return this.sedeRepository.findById(code);
    }
     @Transactional
    public Sede create(Sede sede) {
        Sede sedeTmp = this.sedeRepository.findBySedeLikeOrderByInsituto(sede.getNombre());
        if (sedeTmp == null) {
            return this.sedeRepository.save(sede);
        } else {
            throw new RuntimeException("Sede ya existe");
        }
    }

}
