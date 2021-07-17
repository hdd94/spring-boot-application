package com.example.demo.dao;

import com.example.demo.model.Answer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AnswerDao {

    // Einfügen eines Objekts zum Persistent Object
    // Entweder selber ein Objekt hinzufügen
    int insertAnswer(UUID id, Answer answer);

    // Oder ein vorhandenes Objekt
    default int insertAnswer(Answer answer) {
        UUID id = UUID.randomUUID();
        return insertAnswer(id, answer);
    }

    List<Answer> selectAllAnswers();

    Optional<Answer> selectAnswerById(UUID id);

    int deleteAnswer(UUID id);

    int updateAnswer(UUID id, Answer answer);
}
