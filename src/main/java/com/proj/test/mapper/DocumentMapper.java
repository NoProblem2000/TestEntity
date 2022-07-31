package com.proj.test.mapper;

import com.proj.test.dto.DocumentDto;
import com.proj.test.entity.Document;
import com.proj.test.rule.IMapper;

public class DocumentMapper implements IMapper<DocumentDto, Document> {
    @Override
    public DocumentDto toDTO(Document entity) {
        return new DocumentDto(entity.getId(), entity.getDocumentDate());
    }

    @Override
    public Document toEntity(DocumentDto dto) {
        Document document = new Document();
        document.setId(dto.getId());
        document.setDocumentDate(dto.getDocumentDate());
        return document;
    }
}
