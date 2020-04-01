class SelectionSort
{
    public static void main(String[] args) {
        int[] a={24,-2,43,424,325,3413};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int minIn=i;
            for(int j=i;j<n;j++)
            {
               if(a[j]<a[minIn])
               {
                   minIn=j;
               }


            }
            int temp=a[i];
            a[i]=a[minIn];
            a[minIn]=temp;

        }
        for(int e:a)
        {
            System.out.print(e+" ");
        }

    }
}