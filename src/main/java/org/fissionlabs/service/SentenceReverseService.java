package org.fissionlabs.service;

import org.fissionlabs.model.SentenceReverseModel;
import org.springframework.stereotype.Service;

@Service
public class SentenceReverseService {
	
	public SentenceReverseModel reverseSentence(String input) {
		
		SentenceReverseModel sentenceReverseModel=new SentenceReverseModel();
		sentenceReverseModel.setInput(input);
		String[] words = sentenceReverseModel.getInput().split("\\s");
		String output="";
		for(int i=words.length-1;i>=0;i--) {
			output=output+words[i]+" ";
		}
		sentenceReverseModel.setOutput(output);
		return sentenceReverseModel;
	}

}
