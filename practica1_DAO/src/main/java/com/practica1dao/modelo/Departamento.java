package com.practica1dao.modelo;

public class Departamento {

    private int codigo_departamento;
    private String nombre_departamento;

    public Departamento() {
    }

    public Departamento(int codigo_departamento, String nombre_departamento) {
        this.codigo_departamento = codigo_departamento;
        this.nombre_departamento = nombre_departamento;
    }

    public int getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(int codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.codigo_departamento;
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
        final Departamento other = (Departamento) obj;
        if (this.codigo_departamento != other.codigo_departamento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departamento{" + "codigo_departamento=" + codigo_departamento + ", nombre_departamento=" + nombre_departamento + '}';
    }

}
