import java.util.*;

public class MedianInputStream {

	private static void addNumber(int n,PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap)
	{
		if(minHeap.size()==0 || n<minHeap.peek())
			minHeap.add(n);
		else
			maxHeap.add(n);
	}

	private static void balanceHeap(PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap)
	{
		PriorityQueue<Integer> largerHeap=(maxHeap.size()>minHeap.size())?maxHeap:minHeap;
		PriorityQueue<Integer> smallerHeap=(maxHeap.size()>minHeap.size())?minHeap:maxHeap;

		//difference between the two heaps should always be 1, if greater than 1 then balance the heap
		if(largerHeap.size()-smallerHeap.size()>1)
			smallerHeap.add(largerHeap.poll());
	}

	private static double getMedian(PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap)
	{
		PriorityQueue<Integer> largerHeap=(maxHeap.size()>minHeap.size())?maxHeap:minHeap;
		PriorityQueue<Integer> smallerHeap=(maxHeap.size()>minHeap.size())?minHeap:maxHeap;

		if(largerHeap.size()>smallerHeap.size())
			return largerHeap.peek();

		else
			return (double)(largerHeap.peek() + smallerHeap.peek())/2;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>(new Comparator<Integer>() {

				public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return -1*a.compareTo(b);
				}
				});
		PriorityQueue<Integer> maxHeap= new PriorityQueue<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			addNumber(num,minHeap,maxHeap);
			balanceHeap(minHeap,maxHeap);
			System.out.println(getMedian(minHeap,maxHeap));
		}
	}
}
