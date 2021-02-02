package york.eecs.source;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author song and you
 * @description: @BubbleSort uses bubble sorting algorithm to rank a map based on the values.
 */
public class BubbleSort implements MapSort<String, Integer>{
    /**
     * @map to be sorted;
     */
	public Map<String, Integer> map;
    public void setMap(Map<String, Integer> map) throws MapContainsNullValueException
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
    public Map<String, Integer> getMap()
    {
    	return this.map;
    }
	/**
	 * TODO: There are missing methods, you can find clues from test cases.
     */
	

	/**
	 * @description: Sort a map by the values in ascending order with bubble sorting algorithm. 
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue(){
	/**
	 *  TODO: Implement sorting the maps by values with bubble sorting algorithm.
	 *  	  This method returns the corresponding key list.
	 *//*int n = arr.length; 
     for (int i = 0; i < n-1; i++) 
         for (int j = 0; j < n-i-1; j++) 
             if (arr[j] > arr[j+1]) 
             { 
                 // swap arr[j+1] and arr[j] 
                 int temp = arr[j]; 
                 arr[j] = arr[j+1]; 
                 arr[j+1] = temp; 
             } */
	   ArrayList<String> listkey=new ArrayList<String>();
	   ArrayList<Integer> listvalue=new ArrayList<Integer>();
	   listkey.addAll(map.keySet());
	   for(int i=0;i<listkey.size();i++)
	   {
		   listvalue.add(map.get(listkey.get(i)));
	   }
	   int n=listkey.size();
	   for(int i=0; i<n-1; i++)
	   {
		   for(int j=0; j<n-i-1; j++)
		   {
			   if(listvalue.get(j+1)< listvalue.get(j))
			   {
				   int temp= listvalue.get(j);
				   listvalue.set(j, listvalue.get(j+1));
				   listvalue.set(j+1, temp);
				   String a= listkey.get(j);
				   listkey.set(j, listkey.get(j+1));
				   listkey.set(j+1, a);
			   }
		   }
	   }
	   //System.out.println(listkey);
	   //System.out.println(listvalue);

	   return listkey;
	   
	}
}