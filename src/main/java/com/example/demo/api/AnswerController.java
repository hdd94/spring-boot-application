package com.example.demo.api;

import com.example.demo.model.Answer;
import com.example.demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/answer")
@RestController
public class AnswerController {

    // Referenz zum Service
    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping
    public void addAnswer(@Valid @NonNull @RequestBody Answer answer) {
        answerService.addAnswer(answer);
    }

    @GetMapping
    public List<Answer> getAllAnswers() {
        return answerService.getAllAnswers();
    }

    @GetMapping(path = "{id}")
    public Answer getAnswerById(@PathVariable("id") UUID id) {
        return answerService.getAnswerById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteAnswerById(@PathVariable("id") UUID id) {
        answerService.deleteAnswer(id);
    }

    @PutMapping(path = "{id}")
    public void updateAnswerById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Answer answerToUpdate) {
        answerService.updateAnswer(id, answerToUpdate);
    }
}
