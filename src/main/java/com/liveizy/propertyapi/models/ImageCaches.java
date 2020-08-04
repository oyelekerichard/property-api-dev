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
@Table(name = "image_caches")
public class ImageCaches implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String imageClass;
    private String liveizyId;
    private String destination;
    private Date dateCreated;
    private Date dateUpdated;

    public ImageCaches() {
    }

    public ImageCaches(Integer id, String name, String imageClass, String liveizyId, String destination, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.name = name;
        this.imageClass = imageClass;
        this.liveizyId = liveizyId;
        this.destination = destination;
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

    public String getImageClass() {
        return imageClass;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }

    public String getLiveizyId() {
        return liveizyId;
    }

    public void setLiveizyId(String liveizyId) {
        this.liveizyId = liveizyId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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
        return "ImageCaches{" + "id=" + id + ", name=" + name + ", imageClass=" + imageClass + ", liveizyId=" + liveizyId + ", destination=" + destination + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
