package com.example.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.sbb.answer.Answer;
import com.example.sbb.answer.AnswerRepository;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import com.example.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionService questionService;
	

	@Test
	void contextLoads() {
	}
	
	//@Transactional
	@Test
	void testJpa() {
		
		/*
		 * Question q1 = new Question();
		 * 
		 * q1.setSubject("sbb가 무엇인가요"); q1.setContent("sbb에 대해서 알고 싶습니다. ");
		 * q1.setCreateDate(LocalDateTime.now()); this.questionRepository.save(q1);
		 * 
		 * Question q2 = new Question();
		 * 
		 * q2.setSubject("스프링 부트 모델 질문입니다. "); q2.setContent("ID는 자동으로 생성되나요 ");
		 * q2.setCreateDate(LocalDateTime.now()); this.questionRepository.save(q2);
		 */
		
		/*
		 * List<Question> all = this.questionRepository.findAll(); assertEquals(2,
		 * all.size());
		 * 
		 * Question q = all.get(0); assertEquals("sbbOptional<T>, q.getSubject());
		 */
		
		/*
		 * Optional<Question> oq = this.questionRepository.findById(1);
		 * if(oq.isPresent()) { Question q = oq.get(); assertEquals("sbb가 무엇인가요",
		 * q.getSubject()); }
		 */
		
		/*
		 * Question oq = this.questionRepository.findBySubject("sbb가 무엇인가요");
		 * assertEquals(1, oq.getId());
		 */
		
		/*
		 * Question q = this.questionRepository.findBySubjectAndContent( "sbb가 무엇인가요",
		 * "sbb에 대해서 알고 싶습니다. "); assertEquals(1, q.getId());
		 */
		
		
		/*
		 * List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		 * Question q = qList.get(0);
		 */
		
		/*
		 * Optional<Question> oq = this.questionRepository.findById(1);
		 * assertTrue(oq.isPresent()); Question q = oq.get(); q.setSubject("수정된 제목");
		 * this.questionRepository.save(q);
		 */
		
		/*
		 * assertEquals(2, this.questionRepository.count()); Optional<Question> oq =
		 * this.questionRepository.findById(1); assertTrue(oq.isPresent()); Question q =
		 * oq.get(); this.questionRepository.delete(q); assertEquals(1,
		 * this.questionRepository.count());
		 */
		
		/////////////////////Answer//////////////////////////////////////
		
		/*
		 * Optional<Question> oq = this.questionRepository.findById(2);
		 * assertTrue(oq.isPresent()); Question q = oq.get();
		 * 
		 * Answer a = new Answer(); a.setContent("네 자동으로 생성 됩니다. "); a.setQuestion(q);
		 * a.setCreateDate(LocalDateTime.now()); this.answerRepository.save(a);
		 */
		
		/*
		 * Optional<Answer> oa = this.answerRepository.findById(1);
		 * assertTrue(oa.isPresent()); Answer a = oa.get(); assertEquals(2,
		 * a.getQuestion().getId());
		 */
		
		
		
		/*
		 * Optional<Question> oq = this.questionRepository.findById(2);
		 * assertTrue(oq.isPresent()); Question q = oq.get();
		 * 
		 * List<Answer> answerList = q.getAnswerList(); assertEquals(1,
		 * answerList.size()); assertEquals("네 자동으로 생성 됩니다. ",
		 * answerList.get(0).getContent());
		 */
		
		
		
		for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }
		

		
	}

}
