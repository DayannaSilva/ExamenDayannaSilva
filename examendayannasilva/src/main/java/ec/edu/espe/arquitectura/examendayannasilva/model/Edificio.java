package ec.edu.espe.arquitectura.examendayannasilva.model;

import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="OFI_EDIFICIO")

public class Edificio {
    @Id
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigo;
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codigoSede;
    @Column(name = "NOMMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "PISOS", precision = 2, scale = 0, nullable = false)
    private Integer pisos;
    @Column(name = "SUPERFICIE", precision = 7, scale = 2, nullable = false)
    private Integer superficie;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;
    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false, nullable = false)
    private Sede sede;
    public Edificio() {
    }
    public Edificio(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigoSede() {
        return codigoSede;
    }
    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPisos() {
        return pisos;
    }
    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }
    public Integer getSuperficie() {
        return superficie;
    }
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Edificio other = (Edificio) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Edificio [codigo=" + codigo + ", codigoSede=" + codigoSede + ", nombre=" + nombre + ", pisos=" + pisos
                + ", superficie=" + superficie + ", version=" + version + "]";
    }
   
    

    
}
