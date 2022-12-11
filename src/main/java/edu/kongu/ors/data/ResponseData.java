package edu.kongu.ors.data;

import edu.kongu.ors.model.Candidate;
import edu.kongu.ors.model.Recruiter;
import edu.kongu.ors.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class ResponseData {
	
	private Long userId;
	private User user;
	
	private Long candidateId;
	private Candidate candidate;
	
	private Long recruiterId;
	private Recruiter recruiter;
	
	public static ResponseData empty() {
		return null;
	};

}
