package com.proj.test.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

public class DocumentDto implements Serializable {
    private Integer id;
    private OffsetDateTime documentDate;

    public DocumentDto(Integer id, OffsetDateTime documentDate) {
        this.id = id;
        this.documentDate = documentDate;
    }

    public Integer getId() {
        return id;
    }

    public OffsetDateTime getDocumentDate() {
        return documentDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDocumentDate(OffsetDateTime documentDate) {
        this.documentDate = documentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentDto entity = (DocumentDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.documentDate, entity.documentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentDate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "documentDate = " + documentDate + ")";
    }
}
