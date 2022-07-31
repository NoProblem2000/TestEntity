package com.proj.test.mapper;

import com.proj.test.dto.DictionaryDto;
import com.proj.test.entity.Dictionary;
import com.proj.test.rule.IMapper;

public class DictionaryMapper implements IMapper<DictionaryDto, Dictionary> {
    @Override
    public DictionaryDto toDTO(Dictionary entity) {
        return new DictionaryDto(entity.getId(), entity.getDictionaryValueName());
    }

    @Override
    public Dictionary toEntity(DictionaryDto dto) {
        Dictionary dictionary = new Dictionary();
        dictionary.setId(dto.getId());
        dictionary.setDictionaryValueName(dto.getDictionaryValueName());
        return dictionary;
    }
}
