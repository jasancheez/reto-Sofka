package naves.com.sofka.dao;

import naves.com.sofka.domain.Nave;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author Alex Sánchez
 */

public interface INaveDao extends CrudRepository<Nave, Long>{

    @Query("SELECT n FROM Nave n WHERE n.nombre_nave LIKE %?1%"+"or n.categoria LIKE %?1%"
            +"or n.pais LIKE %?1%"+"or n.peso LIKE %?1%"+"or n.potencia LIKE %?1%"+"or n.capCarga LIKE %?1%"
    +"or n.capEmpuje LIKE %?1%"+"or n.combustible LIKE %?1%")
    public List<Nave> findAll(String nombre);
}
