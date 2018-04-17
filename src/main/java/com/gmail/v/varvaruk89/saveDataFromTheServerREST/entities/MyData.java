package com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;


@Entity
public class MyData implements Serializable {

    @Id
    private String id;

    private String hash;

    private String format;

    private String url;

    private String title;

    private String documentOf;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date datePublished;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date dateModified;

    private String relatedItem;
    @ManyToOne
    private GroupMyData groupMyData;

    public MyData(String id, String hash, String format, String url, String title, String documentOf, Date datePublished, Date dateModified, String relatedItem) {
        this.id = id;
        this.hash = hash;
        this.format = format;
        this.url = url;
        this.title = title;
        this.documentOf = documentOf;
        this.datePublished = datePublished;
        this.dateModified = dateModified;
        this.relatedItem = relatedItem;
    }

    public MyData() {
    }

    public GroupMyData getGroupMyData() {
        return groupMyData;
    }

    public void setGroupMyData(GroupMyData groupMyData) {
        this.groupMyData = groupMyData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocumentOf() {
        return documentOf;
    }

    public void setDocumentOf(String documentOf) {
        this.documentOf = documentOf;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getRelatedItem() {
        return relatedItem;
    }

    public void setRelatedItem(String relatedItem) {
        this.relatedItem = relatedItem;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "id='" + id + '\'' +
                ", hash='" + hash + '\'' +
                ", format='" + format + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", documentOf='" + documentOf + '\'' +
                ", datePublished=" + datePublished +
                ", dateModified=" + dateModified +
                ", relatedItem='" + relatedItem + '\'' +
                '}';
    }
}
