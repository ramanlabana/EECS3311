package york.eecs.source;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author song and you
 * @description: @HeapSort uses max heap algorithm to rank a map based on the values.
 */
public class HeapSort implements MapSort<String, Double>{
	/**
     * @map to be sorted;
     */	
	public Map<String, Double> map;
	public void setMap(Map<String, Double> map) throws MapContainsNullValueException
	    {
	    	ArrayList<String> list= new ArrayList<String>();
	    	list.addAll(map.keySet());
	    	for(int i=0;i<list.size();i++)
	    	{
	    		if(map.get(list.get(i))==null)
	    		{
	    			throw new MapContainsNullValueException("");
	    		}
	    	}
	        this.map=map;
	    }
	 public Map<String, Double> getMap()
	    {
	    	return map;
	    }
	/**
	 * TODO: There are missing methods, you can find clues of these methods from test cases.
     */
	
	
	/**
	 * @description: Sort a map by the values in ascending order max heap sorting algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue() {
		/**
		 *  TODO: Implement sorting the maps by values with max heap sorting algorithm.
		 *  	  This method returns the corresponding key list.
		 *  	  You need to use the auxiliary method, i.e., @heapify.
		 */
		ArrayList<String> listkey= new ArrayList<String>();
		ArrayList<Double> listvalue= new ArrayList<Double>();
		listkey.addAll(map.keySet());
		for(int i=0;i<listkey.size();i++)
		{
			listvalue.add(map.get(listkey.get(i)));
		}
		
		int n = listkey.size();
        for (int i=(n/2)-1; i>= 0; i--)
        {
            heapify(listkey,listvalue, n, i);
        } 
        for (int i=n-1; i>0; i--) 
        {
        	double temp= listvalue.get(0);
        	listvalue.set(0, listvalue.get(i));
        	listvalue.set(i,temp);
            
        	String a= listkey.get(0);
        	listkey.set(0, listkey.get(i));
        	listkey.set(i,a);
 
         
            heapify(listkey, listvalue, i, 0);
        }
		//System.out.println(listkey);
		return listkey;
	}
	
	/**
	 * To heapify a subtree rooted with node `i' which is an index in both @keys and @values. 
	 * `n' is size of heap.
	 */
	public void heapify(ArrayList<String> listkey,ArrayList<Double> listvalue, int n, int i) {
		/**
		 *  TODO: Implement @heapify to build heap. 
		 */
		 int large = i;
	     int left = 2*i+1;
	     int right = 2*i+2;
	     if (left<n && listvalue.get(left) > listvalue.get(large))
	     {
	            large=left;
	     }
	 
	     if (right<n && listvalue.get(right) > listvalue.get(large))
	     {
	            large=right;
	     }
	     if (large!= i)
	     {
	         
	         double temp= listvalue.get(i);
	         listvalue.set(i, listvalue.get(large));
	         listvalue.set(large,temp);
	            
	         String a= listkey.get(i);
	         listkey.set(i, listkey.get(large));
	         listkey.set(large,a);
	         heapify(listkey, listvalue, n, large);
	     }
	}
}