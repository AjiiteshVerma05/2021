public class flip_array {
   public static void main(String[] args) {
    int original[][]={{9,8,7},{6,6,7},{6,9,0}};    
    int flip[][]=new int[3][3];    
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    flip[i][j]=original[j][i];  
    }    
    }    
      
    System.out.println("Printing Matrix without flip");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    System.out.print(original[i][j]+" ");    
    }    
    System.out.println("");   
    }    
    System.out.println("Printing Matrix After flip");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    System.out.print(flip[i][j]+" ");    
    }    
    System.out.println("");    
    }    
}
}

    

