package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Answer {
    private final UUID id;

    @NotBlank
    private final String question;
    @NotBlank
    private final String questionAnswer;


    public Answer(@JsonProperty("id") UUID id,
                  @JsonProperty("question") String question,
                  @JsonProperty("questionAnswer") String questionAnswer) {
        this.id = id;
        this.question = question;
        this.questionAnswer = questionAnswer;
    }

    public UUID getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }
}
