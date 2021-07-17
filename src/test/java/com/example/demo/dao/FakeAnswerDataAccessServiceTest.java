package com.example.demo.dao;

import com.example.demo.model.Answer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class FakeAnswerDataAccessServiceTest {

    private FakeAnswerDataAccessService underTest;

    @Before
    public void setUp() {
        underTest = new FakeAnswerDataAccessService();
    }

    @Test
    public void canPerformCrud() {
//        // Given character called Izuku Midoriya
//        UUID idOne = UUID.randomUUID();
//        Answer answerOne = new Answer(idOne, "Izuku Midoriya");
//
//        // Given character called Bakugo Katsuki
//        UUID idTwo = UUID.randomUUID();
//        Answer answerTwo = new Answer(idTwo, "Bakugo Katsuki");
//
//        // When added to DB
//        underTest.insertAnswer(idOne, answerOne);
//        underTest.insertAnswer(idTwo, answerTwo);
//
//        // Then can retrieve name by id
//        Assert.assertEquals(underTest.selectAnswerById(idOne).get().getName(), "Izuku Midoriya");
//        Assert.assertEquals(underTest.selectAnswerById(idTwo).get().getName(), "Bakugo Katsuki");
    }
}
