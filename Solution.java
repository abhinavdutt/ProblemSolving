import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;


public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int _length_size=Integer.parseInt(in.nextLine());
		int[] _lenghths= new int[_length_size];
		int _length_item;
		for(int _length_i=0;_length_i<_length_size;_length_i++){
			_length_item=Integer.parseInt(in.nextLine());
			_lenghths[_length_i]=_length_item;
			
			
		}
		System.out.println(_lenghths);
		cutStick(_lenghths);
		
	}

	static void cutStick(int[] _lenghths) 
	{
	   if(_lenghths == null || _lenghths.length == 0)
            return;
        
        //Sort the given array
        java.util.Arrays.sort(_lenghths);
        int count = 0; //count of cuts
        int min = _lenghths[0]; //min cut
        
        while(min > 0)
        {
            count = 0; 
            for(int i = 0; i < _lenghths.length; i++)
            {
            	_lenghths[i] = _lenghths[i] - min; //cut the stick with min size
                if(_lenghths[i] >= 0) //If we are able to cut the stick then increase the cut count
                    count++;
                if(_lenghths[i] > 0 && _lenghths[i] < min)
                { //Find the next min cut size of stick
                    min = _lenghths[i];
                }
            }
            
            System.out.println(count);
            if(count <= 1) //If last cut count is 1 or less than 1 then we are done.
                break;
        }
		
	}

}
