package com.proj.test.service;

import com.proj.test.dto.TestDto;
import com.proj.test.entity.Test;
import com.proj.test.exception.DBChangeEntityOperationException;
import com.proj.test.exception.NoRecordFoundException;
import com.proj.test.mapper.TestMapper;
import com.proj.test.repository.TestRepository;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestService {
    private final TestRepository testRepository;
    private static final TestMapper testMapper = new TestMapper();

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestDto findById(Integer id) {
        Optional<Test> test = testRepository.findById(id);
        TestDto testDto;
        if (test.isPresent()) {
            testDto = testMapper.toDTO(test.get());
        } else {
            throw new NoRecordFoundException();
        }

        return testDto;
    }

    public void update(TestDto testDto) {
        try {
            testRepository.save(testMapper.toEntity(testDto));
        } catch (HibernateException exception) {
            throw new DBChangeEntityOperationException("Error updating a record");
        }

    }

    public void deleteById(Integer testId) {

        try {
            testRepository.deleteById(testId);
        } catch (HibernateException exception) {
            throw new DBChangeEntityOperationException("Error deleting a record");
        }
    }

    public void create(TestDto testDto) {
        try {
            testRepository.save(testMapper.toEntity(testDto));
        } catch (HibernateException exception) {
            throw new DBChangeEntityOperationException("Error creating a record");
        }

    }

    public List<TestDto> findAll() {
        List<TestDto> testDtoList = new ArrayList<>();
        List<Test> testList = testRepository.findAll();
        if (testList.size() == 0) {
            throw new NoRecordFoundException();
        }
        for (Test test :
                testList) {
            testDtoList.add(testMapper.toDTO(test));
        }
        return testDtoList;
    }
}
