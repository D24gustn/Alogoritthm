package class01;

public class Instack {
	private int[] stack;
	private int top;
	private int capacity;

	Instack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];

	}

	public boolean push(int num) {
		stack[top++] = num;
		return true;

	}

	public boolean full() {
		return top == capacity;

	}

	public int pop() {
		if (empty())
			return -1;
		return stack[--top];

	}

	public boolean empty() {
		return top == 0;

	}

	public int top() {
		if(empty()) return -1;
		
		return stack[top-1];

	}

	public int size() {
		return top;

	}

	public int capacity() {
		return capacity;

	}

	public void clear() {
		top = 0;

	}

	public void dum() {
		if (empty()) {
			System.out.println("스텍이 비어있습니다");
		} else {
			for (int i = 0; i < top; i++) {
				System.out.print(stack[i] + " ");

			}
			System.out.println();
		}

	}
}
