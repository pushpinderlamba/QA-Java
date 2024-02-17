package Gen.types;

public class Pair <K,V>{
	
	K key;
	V val;

	public Pair() {

	}

	public Pair(K k, V v) {

	this.key = k;

	this.val = v;
	}

	public K getKey() {
	return key;
	}

	public void setKey(K key) {
	this.key = key;
	}

	public V getVal() {
	return val;
	}

	public void setVal(V val) {
	this.val = val;
	}
	}


