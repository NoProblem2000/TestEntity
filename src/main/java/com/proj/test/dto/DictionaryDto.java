package com.proj.test.dto;

import java.io.Serializable;
import java.util.Objects;

public class DictionaryDto implements Serializable {
    private Integer id;
    private String dictionaryValueName;

    public DictionaryDto(Integer id, String dictionaryValueName) {
        this.id = id;
        this.dictionaryValueName = dictionaryValueName;
    }

    public Integer getId() {
        return id;
    }

    public String getDictionaryValueName() {
        return dictionaryValueName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDictionaryValueName(String dictionaryValueName) {
        this.dictionaryValueName = dictionaryValueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryDto entity = (DictionaryDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.dictionaryValueName, entity.dictionaryValueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dictionaryValueName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "dictionaryValueName = " + dictionaryValueName + ")";
    }
}
