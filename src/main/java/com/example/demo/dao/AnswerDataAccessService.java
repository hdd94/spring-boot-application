package com.example.demo.dao;

import com.example.demo.model.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PostgreSQL DB")
public class AnswerDataAccessService implements AnswerDao {
    @Override
    public int insertAnswer(UUID id, Answer answer) {
        return 0;
    }

    @Override
    public List<Answer> selectAllAnswers() {
        return List.of(new Answer(UUID.randomUUID(), "How are you?", "I am fine."));
    }

    @Override
    public Optional<Answer> selectAnswerById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteAnswer(UUID id) {
        return 0;
    }

    @Override
    public int updateAnswer(UUID id, Answer answer) {
        return 0;
    }
}
