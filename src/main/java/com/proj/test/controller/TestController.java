package com.proj.test.controller;

import com.proj.test.dto.TestDto;
import com.proj.test.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/{testId}")
    public ResponseEntity<TestDto> findById(@PathVariable Integer testId) {
        TestDto testDto = testService.findById(testId);
        return new ResponseEntity<>(testDto, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<TestDto>> findAll() {
        List<TestDto> testDtoList = testService.findAll();
        return new ResponseEntity<>(testDtoList, HttpStatus.OK);
    }

    @PatchMapping()
    public ResponseEntity<?> update(@RequestBody TestDto testDto) {
        testService.update(testDto);
        return new ResponseEntity<>("Update was successful", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TestDto testDto) {
        testService.create(testDto);
        return new ResponseEntity<>("Create was successful", HttpStatus.OK);
    }

    @DeleteMapping("/{testId}")
    public ResponseEntity<?> delete(@PathVariable Integer testId) {
        testService.deleteById(testId);
        return new ResponseEntity<>("Delete was successful", HttpStatus.OK);
    }
}
