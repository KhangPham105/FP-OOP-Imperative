

class FP{
    public void main(String[] args){
        // Cách tiếp cận kiểu Imperative
        int sum=0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                sum+=Math.pow(array[i], 2);
            }
        }
        System.out.println(sum);

        // Cách tiếp cận theo kiểu Funtional
        int[] even_array=new int[array.length];
        int j=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                even_array[j++]=array[i];
            }
        }
        for (int i=0; i<j; i++){
            even_array[i]*=even_array[i];
        }
        int FP_sum=0;
        for (int i=0; i<j; i++){
            FP_sum+=even_array[i];
        }
        System.out.println(FP_sum);
    }
}