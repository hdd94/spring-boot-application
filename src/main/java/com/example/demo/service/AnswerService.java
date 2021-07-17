package com.example.demo.service;

import com.example.demo.dao.AnswerDao;
import com.example.demo.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnswerService {

    private final AnswerDao answerDao;

    @Autowired
    public AnswerService(@Qualifier("fakeDao") AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    public int addAnswer(Answer answer) {
        return answerDao.insertAnswer(answer);
    }

    public List<Answer> getAllAnswers() {
        return answerDao.selectAllAnswers();
    }

    public Optional<Answer> getAnswerById(UUID id) {
        return answerDao.selectAnswerById(id);
    }

    public int deleteAnswer(UUID id) {
        return answerDao.deleteAnswer(id);
    }

    public int updateAnswer(UUID id, Answer newAnswer) {
        return answerDao.updateAnswer(id, newAnswer);
    }
}
