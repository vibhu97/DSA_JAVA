package graph;

import java.util.Scanner;

public class Graph {
	
	public static void dfsDummy(int [][]g,int start,boolean visited[]) {
		System.out.println(start);
		visited[start]=true;
		for(int i=0;i<g.length;i++) {
			if(g[start][i]==1 && !visited[i]) {
				dfsDummy(g, i, visited);
			}
		}
	}
	public static void dfs(int g[][]) {
		boolean visited[]=new boolean[g.length];
		for(int i=0;i<g.length;i++) {
			if(visited[i]==false)
				dfsDummy(g, i, visited);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int g[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int sv=sc.nextInt();
			int ev=sc.nextInt();
			g[sv][ev]=1;
			g[sv][ev]=1;
		}
		dfs(g);
				
	}

}
