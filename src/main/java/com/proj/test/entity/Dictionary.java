package com.proj.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "dictionary")
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dictionary_id", nullable = false)
    private Integer id;

    @Column(name = "dictionary_value_name", nullable = false, length = 100)
    private String dictionaryValueName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictionaryValueName() {
        return dictionaryValueName;
    }

    public void setDictionaryValueName(String dictionaryValueName) {
        this.dictionaryValueName = dictionaryValueName;
    }

}