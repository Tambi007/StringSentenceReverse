package org.fissionlabs;

import static org.assertj.core.api.Assertions.assertThat;

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

	@Mock
	SentenceReverseApi sentenceReverseApi;
	
	@InjectMocks
	SentenceReverseService sentenceReverseService;
	
	@Test
	public void reverseSentenceTest() {
		
		 SentenceReverseModel sentenceReverseModel = sentenceReverseService.reverseSentence("hi google");
		 String string = sentenceReverseModel.getInput();
		 //assertThat(" ");
	}

}
