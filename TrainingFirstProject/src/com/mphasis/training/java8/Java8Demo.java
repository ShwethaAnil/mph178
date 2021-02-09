package com.mphasis.training.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Java8Demo {

	public static void main(String[] args) {
			
		Predicate<Integer> p=(a)-> (a>50);
		Predicate<Integer> p1=(a)->(a<89);
		
		Predicate<Integer> t=p.and(p1);
		Predicate<Integer> t1=p.or(p1);
		
		System.out.println(t.test(67));
		IntPredicate idp=(a)-> a<=976.89;
		DoublePredicate dp=(a)-> a<=987;
		System.out.println(p.test(12));
		
		System.out.println(idp.test(123));
		System.out.println(dp.test(67878.98));
		
		BiPredicate<Integer, Integer> bip=(a,b)-> (a>b);
		System.out.println(bip.test(12, 89));
		
		Function<Double, Double> fun1=(num1)-> num1*12;
		System.out.println(fun1.apply(133.98));
		
		BiFunction<Integer, Integer, Integer> bif=
							(num1,num2)-> (num1*num2)+56;						
		System.out.println(bif.apply(123, 8768));	
		
		Consumer<Integer> con=(a) -> System.out.println(a/2);
		con.accept(45);
		con.accept(23);
		
		Supplier<Double> randomValue = () -> Math.random(); 
		System.out.println(randomValue.get());
		
	}

}
