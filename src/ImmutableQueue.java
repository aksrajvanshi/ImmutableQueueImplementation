public class ImmutableQueue<T> implements Queue<T> {

	private Object [] immutableQueue;
	
	public ImmutableQueue() {
		immutableQueue = (Object[]) new Object();
	}
	
	public ImmutableQueue(int queueSize) {
		immutableQueue = (Object[]) new Object[queueSize];
	}
	
	@Override
	public Queue<T> enQueue(T t) {
		
		if(t == null){
			throw new IllegalArgumentException("Enter a valid value to enter in the queue");
		}
		
		ImmutableQueue<T> tempQueue = new ImmutableQueue<>(immutableQueue.length+1);
		for(int i=0; i < immutableQueue.length; i++){
			tempQueue.immutableQueue[i] = immutableQueue[i];
		}
		tempQueue.immutableQueue[immutableQueue.length] = t;
			
		return tempQueue;
	}

	@Override
	public Queue<T> deQueue() {
		ImmutableQueue<T> tempQueue = new ImmutableQueue<>(immutableQueue.length-1);
		for(int i=0; i < immutableQueue.length-1; i++){
			tempQueue.immutableQueue[i] = immutableQueue[i];
		}
			
		return tempQueue;
	}

	@Override
	public T head() {
		if(immutableQueue.length == 0){
			throw new NullPointerException();
		}
		
		return (T) immutableQueue[0];
	}

	@Override
	public boolean isEmpty() {
		
		if(immutableQueue.length == 0){
			return true;
		}
		return false;
	}

}
