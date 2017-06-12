/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elalf
 */
@Entity
@Table(name="encuesta")
@XmlRootElement
public class Encuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "titulo", nullable=false, unique=false)
    private String titulo;

    @Column(name = "descripcion", nullable=false, unique=false)
    private String descripcion;

    @Column(name = "id_usuario", nullable=false, unique=false)
    private int id_usuario;

    @Column(name = "num_preguntas", nullable=false, unique=false)
    private int num_preguntas;

    @Column(name = "visible", nullable=false, unique=false)
    private int visible;

    public Encuesta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getNum_preguntas() {
        return num_preguntas;
    }

    public void setNum_preguntas(int num_preguntas) {
        this.num_preguntas = num_preguntas;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.descripcion);
        hash = 29 * hash + this.id_usuario;
        hash = 29 * hash + this.num_preguntas;
        hash = 29 * hash + this.visible;
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
        final Encuesta other = (Encuesta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        if (this.num_preguntas != other.num_preguntas) {
            return false;
        }
        if (this.visible != other.visible) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "com.models.Encuesta[ id=" + id + " ]";
    }
    
}
