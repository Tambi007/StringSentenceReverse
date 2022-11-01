package org.fissionlabs;

import org.fissionlabs.controller.SentenceReverseApi;
import org.fissionlabs.model.SentenceReverseModel;
import org.fissionlabs.service.SentenceReverseService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringSentenceReverseNewApplicationTests {

	@InjectMocks
	SentenceReverseApi sentenceReverseApi;
	
	@Autowired
	SentenceReverseService sentenceReverseService;
	
	@Test
	public void reverseSentenceTest() {
		
		 SentenceReverseModel sentenceReverseModel = sentenceReverseService.reverseSentence("hi google how are you");
		 String string = sentenceReverseModel.getInput();
		 asserte
	}

}
