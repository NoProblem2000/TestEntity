package com.proj.test.mapper;

import com.proj.test.dto.TestDto;
import com.proj.test.entity.Test;
import com.proj.test.rule.IMapper;


public class TestMapper implements IMapper<TestDto, Test> {

    private static final DocumentMapper documentMapper = new DocumentMapper();
    private static final DictionaryMapper dictionaryMapper = new DictionaryMapper();

    @Override
    public TestDto toDTO(Test entity) {
        return new TestDto(
                entity.getId(),
                entity.getOrder(),
                documentMapper.toDTO(entity.getDocument()),
                dictionaryMapper.toDTO(entity.getDictionary())
        );
    }

    @Override
    public Test toEntity(TestDto dto) {
        Test test = new Test();
        test.setId(dto.getId());
        test.setOrder(dto.getOrder());
        test.setDictionary(dictionaryMapper.toEntity(dto.getDictionary()));
        test.setDocument(documentMapper.toEntity(dto.getDocument()));
        return test;
    }
}
