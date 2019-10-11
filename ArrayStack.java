public class ArrayStack<T> implements Stack<T>{

	private T[] a; 
	private int top; 
	private int size; 

	public ArrayStack(){
		this(500); 
	}

	public ArrayStack(int size){
		this.size = size; 
		this.top = -1; 
		this.a = (T[]) new Object[size]; 
	}

	public T peek()throws Exception{
		if(empty()){
			throw new Exception("Error stack is empty"); 
		}
		return a[top]; 
	}

	public T pop()throws Exception{
		if(empty()){
			throw new Exception("Error stack is empty"); 
		}else{
			return a[top--]; 
		}
	}

	public void push(Object item){
		 a[++top] = (T) item; 
	}

	public boolean empty(){
		return top < 0; 
	}

}