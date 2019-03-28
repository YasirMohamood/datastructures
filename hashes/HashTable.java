public interface HashTable {
	void put(String key, String Valye);

	String get(String key);

	String remove(String key);

	boolean containsKey(String key);

	boolean containsValue(String value);

	int size();

	int capacity();
}