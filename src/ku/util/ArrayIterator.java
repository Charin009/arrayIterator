package ku.util;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
*ArrayIterator made array can iterate all elements 
*@author Charin Tantrakul
*/
public class ArrayIterator<T> implements Iterator<T>  {
	/** attribute for the array we want to iterate over */
	private T[ ] array;
	/*
	 * Set cursor as array index
	 */
	private int cursor;
	
	/**
	 * Initialize a new array iterator with the array to process.
	 * @param array is the array to iterate over
	 */
	public ArrayIterator(T[] array) {
		this.array = array;
		this.cursor = -1 ;        
	}

	/**
	 * Return the next non-null element from array, if any.
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException if there are no more elements
	 *        to return.
	 */
	public T next( ) {
		if(hasNext()==true){
			cursor++;
			if(array[cursor]!=null){
				return array[cursor];
			}
		}
		throw new NoSuchElementException();
	}

	/**
	 * Check next element from array that is non-null element or not.
	 */
	public boolean hasNext(){
		boolean checker = false;
       		for(int i=cursor+1;i<array.length;i++){
            		if(array[i]!=null)
                		checker = true;
        	}
        	return cursor != array.length-1 && checker;
	}
}
