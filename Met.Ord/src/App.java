
public class App {
    public static void main(String[] args) throws Exception {

        int chave = 10;
        
        int avg[] = casoavg(50);
        
        System.out.println(pesquisaSeqSent(chave, avg));
        
    
    }

    public static int pesquisaSEQ(int chave, int v[]){
        int count = 0;

        for (int i = 0; i < v.length; i++) {
            count+=2;
            if(v[i] == chave){
                System.out.println("Operações: " + count);
                return i;
            }
        }
        System.out.println("Operações: " + count);
        return -1;
    }
    public static int pesquisaSeqSent(int chave, int v[]){
        int count = 0;
        int i = 0;
        int c[] = new int[v.length +1];
        System.arraycopy(v, i, c, i, v.length);

        c[v.length]= chave;
        count++;
        while(c[i] != chave){
            count++;
            i++;
        }
        if(i < v.length){
            System.out.println("Operações: " + count);
            return i;
        }
        System.out.println("Operações: " + count);
        return -1;
    }

    public static void print(int v[]) {

    }

    public static int[] casoavg(int n) {
        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * n);
        }

        return v;
    }
}

