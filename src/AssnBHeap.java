
public class AssnBHeap {
	public static void main(String[] args){
		MinBinHeap heap = new MinBinHeap();
		
		EntryPair[] pairs = new EntryPair[7];
		pairs[0] = new EntryPair("hello", 7);
		pairs[1] = new EntryPair("hello", 9);
		pairs[2] = new EntryPair("hello", 11);
		pairs[3] = new EntryPair("hello", 20);
		pairs[4] = new EntryPair("hello", 2);
		pairs[5] = new EntryPair("hello", 10);
		pairs[6] = new EntryPair("hello", 1);
		
		heap.build(pairs);
		
		int[] array = heap.getPriorityArray();
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
		
		
		
		
		
		
		
		
//		heap.insert(new EntryPair("hello", 7));
//		heap.insert(new EntryPair("hello", 8));
//		heap.insert(new EntryPair("hello", 4));
//		heap.insert(new EntryPair("hello", 20));
//		heap.insert(new EntryPair("hello", 30));
//		heap.insert(new EntryPair("hello", 22));
//		heap.insert(new EntryPair("hello", 5));
//		heap.insert(new EntryPair("hello", 15));
//		heap.insert(new EntryPair("hello", 1));
//		
//		
//		int[] array = heap.getPriorityArray();
//		for(int i = 0; i < array.length; i++){
//			System.out.println(array[i]);
//		}
//		
//		heap.delMin();
//		
//		System.out.println("***************");
//		
//		int[] array1 = heap.getPriorityArray();
//		for(int i = 0; i < array1.length; i++){
//			System.out.println(array1[i]);
//		}
//		
//		heap.delMin();
//		
//		System.out.println("***************");
//		
//		int[] array2 = heap.getPriorityArray();
//		for(int i = 0; i < array2.length; i++){
//			System.out.println(array2[i]);
//		}
//	}
	
}
