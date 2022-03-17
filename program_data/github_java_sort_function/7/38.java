    public static int[] sort(int[] arr){
        int step = arr.length / 2;
        while(step >= 1){
            for(int n=0; n<step; n++){
                for(int i=n+step; i<arr.length; i=i+step){
                    for(int j=i; j>0; j = j-step){
                        if(arr[j] < arr[j-step]){
                            swap(arr[j],arr[j-step]);                           
                        }else{
                            break;
                        }
                    }
                }
            }
            step--;
        }
        
        return null;
    }
    public static void swap(int a, int b){
        int k = a;
        a = b;
        b = k;
    }