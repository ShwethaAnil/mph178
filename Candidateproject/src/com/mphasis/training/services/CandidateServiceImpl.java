package com.mphasis.training.services;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.training.pojos.Candidate;

public class CandidateServiceImpl implements CandidateService {
   static  List<Candidate> candidates=new ArrayList<Candidate>();
	static {
		candidates.add(new Candidate("Rakshitha", "Java", "Mangalore", 23));
		candidates.add(new Candidate("Sarika", "C++", "Mangalore", 13));
		candidates.add(new Candidate("Pooja", "Java", "Pune", 23));
		candidates.add(new Candidate("Ashritha", "C", "Chennai", 10));
		candidates.add(new Candidate("Pavithra", "Java", "Bangalore", 3));
		candidates.add(new Candidate("Vyshnavi", "C", "Bangalore", 2));
		candidates.add(new Candidate("Mythri", "DB", "Hyderabad", 9));
		candidates.add(new Candidate("Chaithanya", "Java", "Chennai", 0));
		candidates.add(new Candidate("Lavanya", "DB", "Pune", 14));
		candidates.add(new Candidate("Usha", "C++", "Hyderabad", 25));
		candidates.add(new Candidate("Akansha", "Java", "Mumbi", 1));
		candidates.add(new Candidate("Maanasa", "Java", "Bangalore", 8));
		candidates.add(new Candidate("Smitha", "DB", "Hyderabad", 0));
		candidates.add(new Candidate("Divya", "Java", "Chennai", 0));
		candidates.add(new Candidate("Ashish", "DB", "Pune", 22));
		candidates.add(new Candidate("Evangeline", "C++", "Hyderabad", 25));
		candidates.add(new Candidate("Nagaveni", "Java", "Mumbi", 1));
		candidates.add(new Candidate("Anchit", "Java", "Bangalore", 8));
		candidates.add(new Candidate("Namreen", "Java", "Mangalore", 23));
		candidates.add(new Candidate("Arunima", "C++", "Mangalore", 13));
		candidates.add(new Candidate("Divya Prakash", "Java", "Pune", 23));
		candidates.add(new Candidate("Patil", "C", "Chennai", 10));
		candidates.add(new Candidate("Uttu", "Java", "Bangalore", 3));
		candidates.add(new Candidate("Aayush", "C", "Bangalore", 2));
		candidates.add(new Candidate("Swagath", "DB", "Hyderabad", 9));
		candidates.add(new Candidate("Sagar", "Java", "Mangalore", 23));
		candidates.add(new Candidate("Shivam", "C++", "Mangalore", 13));
		candidates.add(new Candidate("Nagaranjini", "Java", "Pune", 23));
		candidates.add(new Candidate("Sushma", "C", "Chennai", 10));	
	}
	
	@Override
	public List<Candidate> getCandidateList() {
		return candidates;
	}

	@Override
	public void addCandidate(Candidate can) {
		candidates.add(can);
	}

}
