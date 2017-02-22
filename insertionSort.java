
/**
 * Write a description of class insertionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class insertionSort
{
  public int[] intArray={7,4,32,6,8,1,25,43};
  
    
    //look at n index of old array and then put into new array
    public void insertionSort(int[] a){
    int[] intArray2=new int[a.length];
    for(int n=0;n<a.length;n++){
        int k=0;
        for(k=0;k<=n;k++){
            
            if(intArray[n]<intArray2[k]){
                for(int j=k;j<a.length-1;j++){
                    intArray2[j]=intArray2[j+1];
                }
                intArray2[k]=intArray[n];
                
            }
            return;
        }
        
    }
   /*
    for(int m=0;m<a.length;m++){
        System.out.print(intArray2[m]+" ");
    }*/
}
}
