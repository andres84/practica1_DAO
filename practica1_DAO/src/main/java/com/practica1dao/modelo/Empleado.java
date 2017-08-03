package com.practica1dao.modelo;

public class Empleado {

    private int codigo_empleado;
    private String nombre_empleado;
    private String cargo;
    private String dedicacion;
    private String fk_codigo_departamento;

    public Empleado() {
    }

    public Empleado(int codigo_empleado, String nombre_empleado, String cargo, String dedicacion, String fk_codigo_departamento) {
        this.codigo_empleado = codigo_empleado;
        this.nombre_empleado = nombre_empleado;
        this.cargo = cargo;
        this.dedicacion = dedicacion;
        this.fk_codigo_departamento = fk_codigo_departamento;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public String getFk_codigo_departamento() {
        return fk_codigo_departamento;
    }

    public void setFk_codigo_departamento(String fk_codigo_departamento) {
        this.fk_codigo_departamento = fk_codigo_departamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo_empleado;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.codigo_empleado != other.codigo_empleado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo_empleado=" + codigo_empleado + ", nombre_empleado=" + nombre_empleado + ", cargo=" + cargo + ", dedicacion=" + dedicacion + ", fk_codigo_departamento=" + fk_codigo_departamento + '}';
    }

}
