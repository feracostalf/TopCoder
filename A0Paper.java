public class A0Paper
{
   public String canBuild(int[] A){
       int aux;
        for(int i=A.length-1; i>=1; i--){
            aux=A[i]/2;
            if(aux>0){A[i-1]+=aux;}
        }
        if(A[0]>0) return "Possible";
        else return "Impossible";
    }
}