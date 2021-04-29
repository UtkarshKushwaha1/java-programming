//AVERAGING FILTER
class avf {
    
    public static void main(String[] args){

        int a[][]=new int [3][3];
        int b[][]=new int [100][100];
        int c[][]=new int [50][50];
        int temp,sum,l=0,m;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=1;
        }

        for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
                b[i][j]=2;
            }
        }

       
    }
}
