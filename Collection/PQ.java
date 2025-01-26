import java.util.PriorityQueue;
//import java.util.*

class PQ 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		
			pq.add(100);
			pq.add(125);
			pq.add(150);
			pq.add(175);
			pq.add(75);
			pq.add(50);
			pq.add(25);
//	[25, 100, 50, 175, 125, 150, 75]

			
		System.out.println(pq);
	}
}
