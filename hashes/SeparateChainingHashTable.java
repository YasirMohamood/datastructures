import KVPair;
import KVPairList;

public class SeparateChainingHashTable implements HashTable {

	//Private fields & methods
	private KVPairList [] table;
	private int size, count;
	PrimeGenerator primeGenerator;

	//Public fields & methods
	public SeparateChainingHashTable(){
		this.primeGenerator = new PrimeGenerator();
		this.size = primeGenerator.getDefaultPrime();
		this.table = new KVPairList[size];
		for(int i = 0; i < this.size; i++)
			this.table[i] = new KVPairList();
	}

	/*
	* Inserts the (key, value) pair into the Hash Table.
	* If key and/or value are NULL, throw IllegalArgumentException.
	*/
	void put(String key, String Value){

	}

	/*
	* Queries the table for the value of given key.
	* If key is NULL, throw an IllegalArgumentException.
	* If the table doesn't contain key, return NULL.
	*/
	String get(String key){

	}

	/*
	* Queries the table for the value of given key, then removes the (key, value) pair.
	* If key is NULL, throw an IllegalArgumentException.
	* If the table doesn't contain key, return NULL. Otherwise, return the value.
	*/
	String remove(String key){

	}

	/*
	* Checks if table contains key.
	* If the key is NULL, throw an IllegalArgumentException.
	* It the table contains key, return true, else return false.
	*/
	boolean containsKey(String key){

	}

	/*
	* Checks if table contains value.
	* If the value is NULL, throw an IllegalArgumentException.
	* If the table contains value, return true, else return false.
	*/
	boolean containsValue(String value){

	}

	/*
	* Return Hash Table size (i.e. number of elements in hash table).
	*/
	int size(){
		return this.count;
	}

	/*
	* Return Hash Table capacity (i.e. number of cells in hash table).
	*/
	int capacity(){
		return this.size;
	}
}