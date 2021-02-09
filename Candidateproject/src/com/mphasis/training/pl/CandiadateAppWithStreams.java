package com.mphasis.training.pl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mphasis.training.pojos.Candidate;
import com.mphasis.training.services.CandidateService;
import com.mphasis.training.services.CandidateServiceImpl;

public class CandiadateAppWithStreams {
	public static void main(String[] args) {

		CandidateService cService = 
				new CandidateServiceImpl();

		System.out.println("List Of candidates");
		List<Candidate> candidates = 
				cService.getCandidateList();

		candidates.forEach(c -> System.out.println(c));
		
		System.out.println("Sort based on cities");
		candidates.stream()
		.sorted(
			(c1,c2)->c1.getCity().compareTo(c2.getCity()))
		.forEach(System.out::println);
		System.out.println("=============================");
		
		System.out.println("Sort List based on yearsofexpierince");
		candidates.stream()
		.sorted(
			(c1,c2)-> c1.getYearsOfExperience()-c2.getYearsOfExperience())
		.forEach(System.out::println);
		
		System.out.println("=============================");
		System.out.println("List Of Pune Candidates");
		List<Candidate> puneCandidates=candidates.stream()
				.filter((c)->c.getCity().equals("Pune"))
				.collect(Collectors.toList());
		
		puneCandidates.forEach((c)->System.out.println(c));
		System.out.println("=============================");
		System.out.println("List Of Pune Candidates for Java");
		candidates.stream()
				.filter((c)->(c.getCity().equals("Pune") 
						&& c.getTechnicalExpertise()
						.equalsIgnoreCase("Java")))
				.forEach(s-> System.out.println(s));
		System.out.println("=============================");
		System.out.println("Candidate count per city");
		      Map<String,List<Candidate>> cityCount=
		    		  candidates.stream()
		    		  .collect(Collectors.groupingBy(
		    				  c-> c.getCity()));
		
		      for(Entry<String, List<Candidate>> city:
	cityCount.entrySet()) {
System.out.println(city.getKey()+" "+city.getValue().size());	  
		      }
		
System.out.println("=============================");
System.out.println("Candidate count per technical");
	

System.out.println("=============================");
System.out.println("Fresher Candidate List");

List<Candidate> freshers=candidates.stream()
					.filter(c->c.getYearsOfExperience()==0)
					.collect(Collectors.toList());
 freshers.forEach(s->System.out.println(s));
 
 System.out.println("=============================");
 System.out.println("Highest Experience Candidate");
 
 int maxYear=candidates.stream()
		 		.map(c->c.getYearsOfExperience())
		 		.max(Integer::compare)
		 		.get();
 System.out.println("Max year"+maxYear);
 
 List<Candidate> seniours=candidates.stream()
			.filter(c->c.getYearsOfExperience()==maxYear)
			.collect(Collectors.toList());
 seniours.forEach(s->System.out.println(s));
 System.out.println("=============================");
 
 




	}

}
