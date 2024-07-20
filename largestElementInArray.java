public class largestElementInArray {
    static int arr[]={10,20,30,40,50};
        static int largest()
        {
            int i;
            int max=arr[0];
            
            for(i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                    max=arr[i];
            }
            return max;
        }
        static int smallest()
        {
            int min=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<min)
                    min=arr[i];
            }
            return min;
        }
    public static void main(String[] args) {
        System.out.println("The largest Element : "+largest());
        System.out.println("The largest Element : "+smallest());
    }
}
