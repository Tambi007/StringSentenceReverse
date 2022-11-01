package org.fissionlabs.controller;

import org.fissionlabs.model.SentenceReverseModel;
import org.fissionlabs.service.SentenceReverseService;
import org.junit.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


@SpringBootTest
public class SentenceReverseApiTest {
	
	@InjectMocks
	SentenceReverseApi sentenceReverseApi;
	
	@Mock
	SentenceReverseService sentenceReverseService;
	
	@Test
	public void reverseSentenceTest() {
		SentenceReverseModel sentenceReverseModel = new SentenceReverseModel();
		sentenceReverseModel.setInput("test my mock");
		//sentenceReverseModel.setOutput("mock my test");
		Mockito.when(sentenceReverseService.reverseSentence(Mockito.any())).thenReturn(sentenceReverseModel);
		ResponseEntity<SentenceReverseModel> sentenceReversed = sentenceReverseApi.reverseSentence("hi google how are you");
		//assertEquals("mock my test", sentenceReversed.getBody().getOutput());
	}

}
