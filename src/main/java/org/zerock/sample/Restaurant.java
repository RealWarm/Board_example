package org.zerock.sample;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Restaurant {
	
	@Inject
	private Chef chef;

}//end class
