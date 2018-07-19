package trial;

import java.util.Stack;

public class MyQueue<T> {

	Stack<T> q1= new Stack<T>();
	Stack<T> q2 = new Stack<T>();


	public void enqueue (T element)
	{
		q1.push(element);

	}

	public T dequeue()
	{
		if(q2.isEmpty())
		{
			while(!q1.isEmpty())
				q2.push(q1.pop());
		}

		return q2.pop();

	}

	public T peek()
	{
		if(q2.isEmpty())
		{
			while(!q1.isEmpty())
				q2.push(q1.pop());
		}

		return q2.peek();
	}

}


