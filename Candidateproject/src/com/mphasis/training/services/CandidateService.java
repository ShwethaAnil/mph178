package com.mphasis.training.services;

import java.util.List;

import com.mphasis.training.pojos.Candidate;

public interface CandidateService {
	
	public  List<Candidate> getCandidateList();
	public void addCandidate(Candidate can);

}
