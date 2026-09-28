

public class Array {
    public static void main(String[] args) {
        int num[]={23,43,22,11,88,67,99};
        int key=11;
        Boolean found=false;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                System.out.println("found at index :" + i);
             found=true;
                break;
            }
        
    
        }
        if(!found){
        System.out.println("not found");
    }
    }
}
    

