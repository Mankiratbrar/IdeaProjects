public class tst {
    public static void main(String[] args) {
        int ar[]={23,4,33,52,68};
        int ar2[]={84,25,1,23,64,83,68};
        int ar3[]=new int[ar.length + ar2.length];

        for (int i = 0;i<= ar2.length-1;i++)
        {
            ar3[i + ar.length] = ar2[i];
            if(i < ar.length)
                ar3[i]=ar[i];
        }

        for (int i =0 ;i<=ar3.length -1 ;i++)
        {
            System.out.println(ar3[i]);
        }
    }
}
