package graph;
import java.util.*;
public class demo {
  ArrayList<ArrayList<Integer>> graph;
   int v;
   demo(int nodes){
	   v=nodes;
	   graph=new ArrayList<ArrayList<Integer>>();
	   for(int i=0;i<v;i++) {
		   graph.add(new ArrayList<Integer>());
	   }
   }
   void ae(int v,int u) {//adding edge in graph
   graph.get(v).add(u);
   graph.get(u).add(v);//undirected graph
	   
	   
   }
   
   void printG() {
	   for(int i=0;i<v;i++) {
		   System.out.print("nodes "+i);
		   for(int x:graph.get(i))System.out.print(" -> " +x);
		   
		   System.out.println();
	   }
   }
   void bfs(int start) {
	   boolean visited[]=new boolean[v];
	   Queue<Integer> q=new LinkedList<Integer>();
	   q.add(start);
	   visited[start]=true;
		   while (q.isEmpty()==false) {
			   int node=q.poll();
			   System.out.print(node+" ");
			   for(int x:graph.get(node)) {
				   if(visited[x]==false) {
					   visited[x]=true;
					   q.add(x);
				   }
			   }
		   }
	   }
   void RecDFS(int node, boolean visited []) {
	   visited[node]=true;
	   System.out.print(node+" ");
	   for(int x:graph.get(node)){
		   if(visited[x]==false) {
			   RecDFS(x,visited);
		   }
	   }
   }
   void dfs(int s) {
	   boolean visited[]=new boolean[v];
	   RecDFS(s,visited);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo g=new demo(5);
     g.ae(0, 1);
     g.ae(3, 2);
     g.ae(2, 4);
     g.ae(1, 4);
     g.ae(3, 1);
     g.ae(2, 0);
     g.printG();
     g.bfs(0);
     System.out.println();
     g.dfs(0);
     }

}
