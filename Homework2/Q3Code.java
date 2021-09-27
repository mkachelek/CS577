//algo
findPoison(int[] arr, int x) //x is the poison

int size = sizeof(arr);
if(size > 1){

int middle = n/2
if(arr[middle] == x){
   return middle;
}
int[] bottom = [1,...,middle]
int[] top = [middle+1,...,n]

if(poison = in bottom){
  return findPoison(bottom, x);
}else{
  return findPoison(top, x);
} 
           
}
