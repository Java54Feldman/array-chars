package telran.arrays;

public class ArrayChar {
	private char[] array;

	public ArrayChar(char[] array) {
		//this.array = array; так делать нельзя, чтобы не нарушить инкапсуляцию, работать нужно с копией
		this.array = new char[array.length];
		for(int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
	}

	private int compareCommon(ArrayChar another, boolean isIgnoreCase) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		int diff = 0;
		while (index < length && (diff = getDiff(another, index, isIgnoreCase)) == 0) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : diff;
	}	
	
	private int getDiff(ArrayChar another, int index, boolean isIgnoreCase) {
		char first = array[index];
		char second = another.array[index];
		if (isIgnoreCase) {
			first = Character.toLowerCase(first);
			second = Character.toLowerCase(second);
		}
		return first - second;
	}
	
	public int compareTo(ArrayChar another) {
		return compareCommon(another, false);		
	}
	
	public int compareToIgnoreCase(ArrayChar another) {
		return compareCommon(another, true);		
	}
	
	public int indexOf(char character) {
		int index = 0;
		while (index < array.length && array[index] != character) {
			index++;
		}

		return index == array.length ? -1 : index;
	}

	public int lastIndexOf(char character) {
		int index = array.length - 1;
		while (index > -1 && array[index] != character) {
			index--;
		}

		return index;
	}
	
	public boolean contains(char character) {
		return indexOf(character) > -1;
	}
	
	public boolean equals(ArrayChar another) {
		return another != null && compareTo(another) == 0;
	}
	
	public boolean equalsIgnoreCase(ArrayChar another) {
		return another != null && compareToIgnoreCase(another) == 0;
	}
}
