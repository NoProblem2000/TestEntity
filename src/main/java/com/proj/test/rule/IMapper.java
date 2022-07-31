package com.proj.test.rule;

public interface IMapper<T, V> {
    T toDTO(V entity);

    V toEntity(T dto);
}
