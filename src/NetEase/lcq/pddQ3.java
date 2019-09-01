package NetEase.lcq;

public class pddQ3 {
    public static void main(String[] args) {
        double out_t=0.0;
        int len=2;
        int[] temp={2,3};
        int max_t=3;
        for(int k=1;k<=max_t;k++){
            double sum_t = 0.0;
            for(int i=0;i<len;i++){
                double grade_t = 1;
                double temp_t;
                for(int j = 0; j<len;j++){
                    int op=0;
                    if(j==i)
                        op=2;
                    else if(j<i)
                        op=1;
                    else
                        op=3;

                    temp_t =func(temp,j,k,op);
                    grade_t *=temp_t;
                }
                sum_t +=grade_t;
            }
            out_t+=sum_t*k;
        }
        System.out.println(out_t);
    }

    static double func(int[] arrays,int index,int k,int op) {
        if(op == 1){
            if(k == 1)
                return 0.0;
            if(arrays[index] < k)
                return 1.0;
            else
                return (float)(k-1)/arrays[index];
        } else if (op == 2) {
            if(arrays[index] >= k)
                return (float)1/arrays[index];
            else
                return 0.0;
        } else if(op == 3) {
            if(arrays[index] < k)
                return 1.0;
            else
                return (float)(k)/arrays[index];
        }
        return 0.0;
    }
}
