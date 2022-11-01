package org.fissionlabs.model;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SentenceReverseModel extends RepresentationModel<SentenceReverseModel>{
	
	private String input;
	private String output;

}
