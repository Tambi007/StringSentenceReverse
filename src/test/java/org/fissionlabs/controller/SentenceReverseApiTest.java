package org.fissionlabs.controller;

import org.fissionlabs.model.SentenceReverseModel;
import org.fissionlabs.service.SentenceReverseService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SentenceReverseApiTest {
	
	@InjectMocks
	SentenceReverseApi sentenceReverseApi;
	
	@Mock
	SentenceReverseService sentenceReverseService;
	
	@Test
	public void reverseSentenceTest() {
		
		 SentenceReverseModel sentenceReverseModel = sentenceReverseService.reverseSentence("hi google how are you");
		 String string = sentenceReverseModel.getInput();
		 a
	}

}
