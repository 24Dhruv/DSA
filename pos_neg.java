    public static void plusMinus(int arr[]) {
    int pos=0;
    int neg=0;
    int zero=0;
    for(int i=0;i<a.length;i++){
        if(i<0){
            neg++;
        }
        if(i>0){
            pos++;
        }
        else{
            zero++;
        }
    }
    System.out.println(pos);
        System.out.println(neg);
            System.out.println(zero);
    }
}
