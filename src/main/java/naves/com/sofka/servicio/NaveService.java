package naves.com.sofka.servicio;

import java.util.List;
import naves.com.sofka.domain.Nave;

/**
 *
 * @author Alex Sánchez
 */
public interface NaveService {
    
    public List<Nave> listarNaves(String palabraClave);
    
    public void guardar (Nave nave);
    
    public void eliminar (Nave nave);
    
    public Nave buscar (Nave nave);
}
