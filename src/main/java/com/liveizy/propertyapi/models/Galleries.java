/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author richard.oyeleke
 */
@Entity
@Table(name = "galleries")
public class Galleries implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String fileType;
    private Integer gallerableId;
    private Date dateCreated;
    private Date dateUpdated;

    public Galleries() {
    }
    
    public Galleries(Integer id, String name, String fileType, Integer gallerableId, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.name = name;
        this.fileType = fileType;
        this.gallerableId = gallerableId;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getGallerableId() {
        return gallerableId;
    }

    public void setGallerableId(Integer gallerableId) {
        this.gallerableId = gallerableId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Galleries{" + "id=" + id + ", name=" + name + ", fileType=" + fileType + ", gallerableId=" + gallerableId + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
