/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;


import java.io.*; 
import java.util.*; 

// Этот класс представляет ориентированный граф, используя список смежности
// представление
class Graph 
{ 
	private int V; // Количество вершин
        int c =0;
        
	// Массив списков для представления списка адресов
	private LinkedList<Integer> adj[]; 

	// Конструктор
	Graph(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	// Функция добавления ребра в граф
	void addEdge(int v, int w) 
	{ 
		adj[v].add(w); // Добавить w в список v.
	} 

	// Функция, используемая DFS
	void DFSUtil(int v,boolean visited[]) 
	{ 
		// Отметить текущий узел как посещенный и распечатать его
		visited[v] = true; 
               
		System.out.print(v+" "); 

		// Повторить для всех вершин, смежных с этой вершиной
		Iterator<Integer> i = adj[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFSUtil(n, visited); 
		} 
	} 

	// Функция для обхода DFS. Он использует рекурсивный DFSUtil ()
	void DFS(int v) 
	{ 
		// Отметьте все вершины, которые не были посещены (заданы как
                // false по умолчанию в java)
		boolean visited[] = new boolean[V]; 

		// Вызов рекурсивной вспомогательной функции для печати обхода DFS
		DFSUtil(v, visited); 
	} 

	public static void main(String args[]) 
	{ 
		Graph g = new Graph(6); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2);
                g.addEdge(1, 0); 
		g.addEdge(1, 2); 
                g.addEdge(1, 3); 
                g.addEdge(2, 0); 
                g.addEdge(2, 1); 
		g.addEdge(2, 4); 
		g.addEdge(3, 1); 
		g.addEdge(3, 4); 
                g.addEdge(4, 3); 
                g.addEdge(4, 2); 
                g.addEdge(4, 5); 
                g.addEdge(5, 4); 

		System.out.println("Обход по графу в глубину: "); 

		g.DFS(0); 
	} 
} 

