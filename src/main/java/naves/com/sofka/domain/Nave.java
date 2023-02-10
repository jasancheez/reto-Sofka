
package naves.com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author FELIPE
 */
@Data
@Entity
@Table(name = "nave")
public class Nave implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nave;
    private String nombre_nave;
    private String categoria;
    private String pais;
    private String peso;
    private String potencia;
    private String capEmpuje;
    private String capCarga;
    private String combustible;
    
    
    
}
