
public class Quick_Find {
	public static void main(String args[]) {
		QuickFind q = new QuickFind(10);
		q.union(2, 5);
		System.out.println(q.connected(2, 5));
		
	}

}
class QuickFind {
    private int[] root;

    public QuickFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    //Muy rápido, en tiempo O(1), porque simplemente devuelve el valor de root[x].
 int find(int x) {
        return root[x];
    }
 
 //Costoso, en tiempo O(N), porque necesita actualizar todos los elementos que tienen la raíz rootY a rootX. 
 //Esto se debe a que en cada unión, se recorren todos los elementos para actualizar sus raíces.
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
