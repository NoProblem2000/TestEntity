package com.proj.test.dto;

import java.io.Serializable;
import java.util.Objects;

public class TestDto implements Serializable {
    private Integer id;
    private Integer order;
    private DocumentDto documentDto;
    private DictionaryDto dictionaryDto;

    public TestDto(Integer id, Integer order, DocumentDto document, DictionaryDto dictionary) {
        this.id = id;
        this.order = order;
        this.documentDto = document;
        this.dictionaryDto = dictionary;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOrder() {
        return order;
    }

    public DocumentDto getDocument() {
        return documentDto;
    }

    public DictionaryDto getDictionary() {
        return dictionaryDto;
    }

    public void setId(Integer id) {
        this.id = id;

    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setDocumentDto(DocumentDto documentDto) {
        this.documentDto = documentDto;
    }

    public void setDictionaryDto(DictionaryDto dictionaryDto) {
        this.dictionaryDto = dictionaryDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto entity = (TestDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.order, entity.order) &&
                Objects.equals(this.documentDto, entity.documentDto) &&
                Objects.equals(this.dictionaryDto, entity.dictionaryDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order, documentDto, dictionaryDto);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "order = " + order + ", " +
                "document = " + documentDto + ", " +
                "dictionary = " + dictionaryDto + ")";
    }
}
