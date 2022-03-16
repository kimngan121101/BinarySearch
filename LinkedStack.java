
public class LinkedStack<T> implements StackADT<T> {
  
	
	private List<T> list;
	public LinkedStack() {
		list = new List<T>();
	}

	@Override
	public void push(T element) {
		list.addFirst(element);
	}

	@Override
	public T pop() {
		T generic = list.getFirst();
		list.delete(0);
		return generic ;
	}

	@Override
	public T peek() {
		return list.getFirst();
	}

	@Override
	public boolean isEmpty() {
		if (list.length() == 0)
			return true;
		else
			return false;
	}

	@Override
	public int size() {
		return list.length();
	}

}
