class UnionFind{
	int[] root;
	
	public UnionFind(int size) {
		root = new int[size];
		for(int i=1; i<size; i++){
			root[i] = i;
			System.out.println(root[i]);
			
		}
	}
	
	public int find(int x) {
		return root[x];
	}
	
	public boolean conected(int x, int y) {
		return root[x] == root[y];
		
	}
	
	public void union(int x, int y){
		int rootx = root[x];
		int rooty = root[y];
		
		if(rootx != rooty){
			for(int i = 1; i< root.length; i++){
				if(root[i] == rooty ){
					root[y] = root[x];
					
				}
				
			}
			
		}
		
	}
	
}

class App{
	public static void main(String args[]) {
		
		UnionFind u = new UnionFind(10);
		u.union(2,5);
		System.out.println(u.conected(2,5));
		
		
	}
}