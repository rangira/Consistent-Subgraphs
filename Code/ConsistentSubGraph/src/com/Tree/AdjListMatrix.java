package com.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AdjListMatrix
{
	static Map<Integer, Set<Integer>> children=new HashMap <Integer, Set<Integer>> ();
	
	
	
	
	static double subGraphs(Integer node)
	{   
		double product=1;
		Set<Integer>set=children.get(node);
		if(set.isEmpty())
		{
			return 1;
		}
		else
		{

			
			for(Integer child:set)
			{
				product=product*(1+subGraphs(child));
			}
		}
		return product;
		
	}

	public static void main(String 
			[] args) throws FileNotFoundException
	{
		int nodes=25, cntNode=0,cntAdj=0;
		Scanner scanner = new Scanner(new File("/home/helloworld/tree_100.txt"));
		while(scanner.hasNextLine())
		{
			cntNode++;
			System.out.println("cntNode"+cntNode);

			children.put(Integer.valueOf(cntNode),new HashSet<Integer>());
			String line;
			Set<Integer>tempNode=new HashSet<Integer>();
			String lineSplit[]=new String[100];
			line=scanner.nextLine();
			System.out.println("line"+line);
			lineSplit=line.split(" ");
			for (int i = 0; i < lineSplit.length; i++) {
				System.out.print(lineSplit[i]);
				if(Integer.parseInt(lineSplit[i])==1){
					tempNode.add(Integer.valueOf(i+1));

				}
			}
			children.put(cntNode, tempNode);
		}
		System.out.println("children"+children);
		System.out.println((long)subGraphs(Integer.valueOf(1)));

	}
}