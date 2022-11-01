package org.fissionlabs.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.fissionlabs.model.SentenceReverseModel;
import org.fissionlabs.service.SentenceReverseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/sentenceReverse")
public class SentenceReverseApi {
	
	private SentenceReverseService sentenceReverseService;

	public SentenceReverseApi(SentenceReverseService sentenceReverseService) {
		super();
		this.sentenceReverseService = sentenceReverseService;
	}
	
	@PostMapping("/{input}")
	public ResponseEntity<SentenceReverseModel> reverseSentence(@PathVariable String input){
		SentenceReverseModel sentenceReverseModel = sentenceReverseService.reverseSentence(input);
		sentenceReverseModel.add(linkTo(methodOn(SentenceReverseApi.class).reverseSentence(sentenceReverseModel.getInput())).withSelfRel());
		return new ResponseEntity<>(sentenceReverseModel,HttpStatus.OK);
	}
	
}
