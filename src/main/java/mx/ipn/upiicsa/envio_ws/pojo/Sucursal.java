package mx.ipn.upiicsa.envio_ws.pojo;
// Generated 22/07/2017 11:39:48 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sucursal generated by hbm2java
 */
public class Sucursal  implements java.io.Serializable {


     private int id;
     private CadenaComercial cadenaComercial;
     private String codigo;
     private String descricpcion;
     private Date fechaAlta;
     private String usuarioAlta;
     private int status;
     private Set departamentos = new HashSet(0);

    public Sucursal() {
    }

	
    public Sucursal(int id, CadenaComercial cadenaComercial, String codigo, String descricpcion, Date fechaAlta, String usuarioAlta, int status) {
        this.id = id;
        this.cadenaComercial = cadenaComercial;
        this.codigo = codigo;
        this.descricpcion = descricpcion;
        this.fechaAlta = fechaAlta;
        this.usuarioAlta = usuarioAlta;
        this.status = status;
    }
    public Sucursal(int id, CadenaComercial cadenaComercial, String codigo, String descricpcion, Date fechaAlta, String usuarioAlta, int status, Set departamentos) {
       this.id = id;
       this.cadenaComercial = cadenaComercial;
       this.codigo = codigo;
       this.descricpcion = descricpcion;
       this.fechaAlta = fechaAlta;
       this.usuarioAlta = usuarioAlta;
       this.status = status;
       this.departamentos = departamentos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public CadenaComercial getCadenaComercial() {
        return this.cadenaComercial;
    }
    
    public void setCadenaComercial(CadenaComercial cadenaComercial) {
        this.cadenaComercial = cadenaComercial;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricpcion() {
        return this.descricpcion;
    }
    
    public void setDescricpcion(String descricpcion) {
        this.descricpcion = descricpcion;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getUsuarioAlta() {
        return this.usuarioAlta;
    }
    
    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public Set getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Set departamentos) {
        this.departamentos = departamentos;
    }




}


