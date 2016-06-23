
public class MinBinHeap implements HeapInterface{
	int last = 0;
	int root = 1;
	EntryPair[] heap = new EntryPair[1000];
	
	public MinBinHeap(){
		heap[0] = new EntryPair("null first", -5000);
	}
	
	public void insert(EntryPair entry){
		if(entry.getPriority() != 0 && entry.getValue() != null){
			last++;
			int n = last;
			int p = parent(n);
			int priority = entry.getPriority();
			EntryPair temp;
			heap[n] = entry;
			
			while((p != 0) && (priority < heap[p].getPriority())){
				temp = heap[n];
				heap[n] = heap[p];
				heap[p] = temp;
				n = p;
				p = parent(n);
			}
		}
	}
	
	public EntryPair getMin(){
		return heap[1];
	}
	
	public void delMin(){
		if(this.size() == 0){}
		else if(this.size() == 1){
			last--;
			heap[root] = null;
		}
		else{
			heap[root] = heap[last];
			heap[last] = null;
			last--;
			EntryPair temp;
			boolean done = false;
			int n = root;
			int c = 0;
			while(!done){
				if(onlyLeftC(n)){
					c = leftC(n);
				}
				else if(isLeaf(n)){
					done = true;
				}
				else{
					if(heap[leftC(n)].getPriority()<heap[rightC(n)].getPriority()){
						c = leftC(n);
					}
					else{
						c = rightC(n);
					}
				}
				if(heap[n].getPriority()> heap[c].getPriority()){
					temp = heap[n];
					heap[n] = heap[c];
					heap[c] = temp;
					n = c;
				}
				else{
					done = true;
				}
			}
		}
	}
	
	public void build(EntryPair[] entries){
		if(heap[root] == null){
			for(int i = 1; i < entries.length + 1; i++){
				heap[i] = entries[i-1];
			}
			last = entries.length;
			
			int n = last;
			EntryPair temp;
			
			while(n > 1){
				int p = parent(n);
				
				if(heap[p].getPriority() > heap[n].getPriority()){
					temp = heap[n];
					heap[n] = heap[p];
					heap[p] = temp;
				}
				
				n -= 1;
			}
		}
	}
	
	public int size(){
		return last;
	}
	
	public int parent(int n){
		return (int) Math.floor(n/2);
	}
	
	public int leftC(int n){
		return 2*n;
	}
	
	public int rightC(int n){
		return 2*n + 1;
	}
	public boolean isLeaf(int n){
		return leftC(n) > last && rightC(n) > last;
	}
	
	public boolean onlyLeftC(int n){
		return rightC(n) > last && leftC(n) <= last;
	}
	
	public int[] getPriorityArray(){
		int[] priorityArray = new int[this.size()];
		for(int i = 1; i < this.size() + 1; i++){
			priorityArray[i-1] = heap[i].getPriority();
		}
		return priorityArray;
	}
	
}
