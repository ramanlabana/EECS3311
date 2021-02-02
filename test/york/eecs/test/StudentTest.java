package york.eecs.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import york.eecs.source.BubbleSort;
import york.eecs.source.HeapSort;
import york.eecs.source.MapContainsNullValueException;

public class StudentTest {
 /**
  * TODO: Please write at least 5 test cases for testing @BubbleSort.
  * TODO: Please write at least 5 test cases for testing @HeapSort.
  */
	BubbleSort bubble;
	HeapSort heapsort;
	 @Before
	public void setUp() throws Exception {
		 bubble = new BubbleSort();
		 heapsort = new HeapSort();
	    }
	@Test
    public void test_bubble_basic1() throws MapContainsNullValueException {
	 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("tommy", 99);
		map_to_be_sorted.put("alen", -30);
		map_to_be_sorted.put("fallon", 87); 
		map_to_be_sorted.put("Joy", 16);
     
      /**
       * Initialize the `map' in @BubbleSort with `map_to_be_sorted'.
       */
      bubble.setMap(map_to_be_sorted);
        
     /**
      * @Expectedresult: the order of keys after ranking `map' by value with bubble algorithm.
      */
     ArrayList<String> expected_result = new ArrayList<String>();
     expected_result.add("alen");
     expected_result.add("Joy");
     expected_result.add("fallon");
     expected_result.add("tommy");
	 
     /**
	  * map size should be the same;
	  */
	 Assert.assertEquals(map_to_be_sorted.size(), bubble.getMap().size());   
	 /**
	  * Expected result should have the same size of the ranked key list;
      */		    
     Assert.assertEquals(expected_result.size(), bubble.sortbyValue().size());
     /**
	  * Elements in the same position from the expected result and the ranked key list should the same;
	  */ 
     for(int i =0; i<expected_result.size(); i++) {
    	 Assert.assertEquals(expected_result.get(i), bubble.sortbyValue().get(i));
     }
 } 

    @Test(expected = MapContainsNullValueException.class)
    public void test_bubble_exception1(){
	 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("naruto", 12);
		map_to_be_sorted.put("sammy", null); 
		map_to_be_sorted.put("den", 107);
     
       /**
        * Initialize the `map' in class @BubbleSort with `map_to_be_sorted' by call method @setMap. 
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
       bubble.setMap(map_to_be_sorted);
 } 	 
    @Test
    public void test_bubble_basic2() throws MapContainsNullValueException {
	 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("lone", 79);
		map_to_be_sorted.put("jamie", 35);
		map_to_be_sorted.put("nikki", 79); 
		map_to_be_sorted.put("sam", 56);
     
      /**
       * Initialize the `map' in @BubbleSort with `map_to_be_sorted'.
       */
      bubble.setMap(map_to_be_sorted);
        
     /**
      * @Expectedresult: the order of keys after ranking `map' by value with bubble algorithm.
      */
     ArrayList<String> expected_result = new ArrayList<String>();
     expected_result.add("jamie");
     expected_result.add("sam");
     expected_result.add("lone");
     expected_result.add("nikki");
    
	 
     /**
	  * map size should be the same;
	  */
	 Assert.assertEquals(map_to_be_sorted.size(), bubble.getMap().size());   
	 /**
	  * Expected result should have the same size of the ranked key list;
      */		    
     Assert.assertEquals(expected_result.size(), bubble.sortbyValue().size());
     /**
	  * Elements in the same position from the expected result and the ranked key list should the same;
	  */ 
     for(int i =0; i<expected_result.size(); i++) {
    	 Assert.assertEquals(expected_result.get(i), bubble.sortbyValue().get(i));
     }
 } 

    @Test(expected = MapContainsNullValueException.class)
    public void test_bubble_exception2(){
	 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("LV", 54);
		map_to_be_sorted.put("Prada", 304);
		map_to_be_sorted.put("Balenciaga", null); 
		map_to_be_sorted.put("Dior", 107);
     
       /**
        * Initialize the `map' in class @BubbleSort with `map_to_be_sorted' by call method @setMap. 
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
       bubble.setMap(map_to_be_sorted);
 } 	 
    @Test(expected = MapContainsNullValueException.class)
    public void test_bubble_exception(){
	 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		map_to_be_sorted.put("sky", 45);
		map_to_be_sorted.put("jame", 30);
		map_to_be_sorted.put("sammy", null); 
     
       /**
        * Initialize the `map' in class @BubbleSort with `map_to_be_sorted' by call method @setMap. 
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
       bubble.setMap(map_to_be_sorted);
 } 
    @Test
    public void test_heap_basic1() {
	Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
	map_to_be_sorted.put("bell", 87.2);
	map_to_be_sorted.put("roger", 57.2);
	map_to_be_sorted.put("fido", 85.2);
	map_to_be_sorted.put("virgin", 1.03); 
	map_to_be_sorted.put("freedom", 70.2);
    
    /**
     * Initialize the `map' in bubble with `map_to_be_sorted';
     */
    heapsort.setMap(map_to_be_sorted);    
    
    /**
     * Expected results: the order of keys after ranking `map' by value with max heap algorithm;
     */
	ArrayList<String> results = new ArrayList<String>();
	results.add("virgin");
	results.add("roger");
	results.add("freedom");
	results.add("fido");
	results.add("bell");
	
	/**
	 * map size should be the same;
	 */
	Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());
	/**
	 * Expected result should have the same size of the ranked key list;
	 */
    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());
    
    /**
     * Elements in the same position from the expected result and the ranked key list should the same;
     */
	for(int i =0; i<results.size(); i++) {
		 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
	}
 }
    

    @Test(expected = MapContainsNullValueException.class)
    public void test_heap_exception1(){
	 Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
		map_to_be_sorted.put("A", 78.2);
		map_to_be_sorted.put("B", null);
		map_to_be_sorted.put("E", null); 
		map_to_be_sorted.put("C", 10.3);
     
       /**
        * Initialize the `map' in class @HeapSort with `map_to_be_sorted' by call method @setMap;
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
		heapsort.setMap(map_to_be_sorted);	    
    }
    @Test
    public void test_heap_basic2() {
	Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
	map_to_be_sorted.put("A", 50.2);
	map_to_be_sorted.put("E", 75.3);
	map_to_be_sorted.put("C", 25.3);
	map_to_be_sorted.put("D", 50.2); 
	map_to_be_sorted.put("B", 78.9);
    
    /**
     * Initialize the `map' in bubble with `map_to_be_sorted';
     */
    heapsort.setMap(map_to_be_sorted);    
    
    /**
     * Expected results: the order of keys after ranking `map' by value with max heap algorithm;
     */
	ArrayList<String> results = new ArrayList<String>();
	results.add("C");
	results.add("A");
	results.add("D");
	results.add("E");
	results.add("B");
	
	/**
	 * map size should be the same;
	 */
	Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());
	/**
	 * Expected result should have the same size of the ranked key list;
	 */
    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());
    
    /**
     * Elements in the same position from the expected result and the ranked key list should the same;
     */
	for(int i =0; i<results.size(); i++) {
		 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
	}
 }
    

    @Test(expected = MapContainsNullValueException.class)
    public void test_heap_exception2(){
	 Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
		map_to_be_sorted.put("Aly", null);
		map_to_be_sorted.put("Bob", 30.1);
		map_to_be_sorted.put("Eric", null); 
		map_to_be_sorted.put("Cattie", 107.3);
     
       /**
        * Initialize the `map' in class @HeapSort with `map_to_be_sorted' by call method @setMap;
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
		heapsort.setMap(map_to_be_sorted);	    
    }
    @Test(expected = MapContainsNullValueException.class)
    public void test_heap_exception3(){
	 Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
		map_to_be_sorted.put("man", null);
		map_to_be_sorted.put("woman", 30.1);
		map_to_be_sorted.put("Eric", null); 
     
       /**
        * Initialize the `map' in class @HeapSort with `map_to_be_sorted' by call method @setMap;
        * Method @setMap throws MapContainsNullValueException, when the values in the map contain @null.
        */
		heapsort.setMap(map_to_be_sorted);	    
    }
}

