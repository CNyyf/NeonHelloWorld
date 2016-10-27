package helloworld;

import java.util.ArrayList;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		Stack.StackIterator sit = s.new StackIterator();
		for(;sit.hasNext();) {
			System.out.println(sit.next());
		}
		sit.reset();
	}
	private ArrayList<Integer> data = new ArrayList<Integer>();
	public void push(int x) {
		data.add(0, (Integer)x);
	}
	public int pop() {
		if(data.size() == 0) {
			return -1;
		}
		int x = (int)data.get(0);
		data.remove(0);
		return x;
	}
	public int size() {
		return data.size();
	}
	public void clear() {
		data.clear();
	}
	
	public class StackIterator{
		private int currentIndex;
		StackIterator() {
			currentIndex = 0;
		}
		public void reset() {
			currentIndex = 0;
		}
		public boolean hasNext() {
			if(currentIndex < Stack.this.data.size()){
				return true;
			}
			return false;
		}
		public int next() {
			int x = Stack.this.data.get(currentIndex);
			currentIndex++;
			return x;
		}
	}

}
