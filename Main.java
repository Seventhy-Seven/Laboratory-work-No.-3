package arrays;

class project8 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char[] exception = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i;
        int j;

        for(i = 0; i < n; i++)
        {
            boolean statement = true;
            for(j = 0; j < exception.length; j++)
            {
                if(b == exception[j])
                {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement)
            {
                charArray[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(charArray[k] + "\t");
        }
    }
}