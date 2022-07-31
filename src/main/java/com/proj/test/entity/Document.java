package com.proj.test.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id", nullable = false)
    private Integer id;

    @Column(name = "document_date", nullable = false)
    private OffsetDateTime documentDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OffsetDateTime getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(OffsetDateTime documentDate) {
        this.documentDate = documentDate;
    }

}