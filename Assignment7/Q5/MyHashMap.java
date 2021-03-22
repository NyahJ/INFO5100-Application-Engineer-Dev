package Q5;

import java.util.HashSet;
import java.util.Set;

public class MyHashMap {
	private Set<Entry> entries;
	
	public MyHashMap() {
		entries = new HashSet<>();
	}
	
	public void put(int key, int value) {
		Entry entry = new Entry(key, value);
		entries.add(entry);
	}
	
	public int get(int key) {
		
	}x
}

class Entry {
	private int key;
	private int value;
	
	public Entry(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(key).hashCode();
	}
}
