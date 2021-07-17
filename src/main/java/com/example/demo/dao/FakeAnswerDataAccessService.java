package com.example.demo.dao;

import com.example.demo.model.Answer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeAnswerDataAccessService implements AnswerDao {

    private static List<Answer> DB = new ArrayList<>();

    @Override
    public int insertAnswer(UUID id, Answer answer) {
        DB.add(new Answer(id, answer.getQuestion(), answer.getQuestionAnswer()));
        return 1;
    }

    @Override
    public List<Answer> selectAllAnswers() {
        return DB;
    }

    @Override
    public Optional<Answer> selectAnswerById(UUID id) {
        return DB.stream().filter(answer -> answer.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteAnswer(UUID id) {
        Optional<Answer> answerMaybe = selectAnswerById(id);
        if (answerMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(answerMaybe.get());
        return 1;
    }

    @Override
    public int updateAnswer(UUID id, Answer update) {
        selectAnswerById(id).map(answer -> {
            // Index des Objekts im Array
            int indexOfAnswerToUpdate = DB.indexOf(answer);
            if (indexOfAnswerToUpdate >= 0) {
                DB.set(indexOfAnswerToUpdate, new Answer(id, update.getQuestion(), update.getQuestionAnswer()));
                return 1;
            }
            return 0;
        }).orElse(0);
        return 0;
    }
}
