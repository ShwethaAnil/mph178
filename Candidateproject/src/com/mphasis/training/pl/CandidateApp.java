package com.mphasis.training.pl;

import java.util.List;
import java.util.Scanner;

import com.mphasis.training.pojos.Candidate;
import com.mphasis.training.services.CandidateService;
import com.mphasis.training.services.CandidateServiceImpl;

public class CandidateApp {
	public static void main(String args[]) {
	CandidateService cService=new CandidateServiceImpl();
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("1. View Candidate \n "
				+ "2. Add Candidate");
		switch(sc.nextInt()) {
		case 1:List<Candidate> cands=cService.getCandidateList();
		 	cands.forEach(c-> System.out.println(c));
			break;
		case 2:System.out.println("enter candidate details name, techincal, City and experience");
			Candidate ca=new Candidate(sc.next(), sc.next(), sc.next(), sc.nextInt());
			cService.addCandidate(ca);
			break;
		case 3:
			break;
		default: System.out.println("Invalid choice");	
		}
		
	}while(true);
	}
}
