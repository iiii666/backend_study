package codingtest;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> hierarchy = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            hierarchy.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> milk = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            milk.add(0);
        }
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int cownum = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            milk.set(index - 1, cownum);

        }
        boolean one = hierarchy.contains(1);
        System.out.println("one = " + one);
//        for (int i = 0; i < hierarchy.size(); i++) {
//            System.out.println(hierarchy.get(i));
//
//        }

        if(one == true){//1 있을 때 앞에서
            for(int i =0; i<M;i++){
                int temp = hierarchy.get(i);
                for(int j = 0;j<N;j++){
                    if(!milk.contains(temp)){
                        milk.set(milk.indexOf(0),temp);
                        break;
                    }else{
                        break;
                    }
                }
            }
        }else{//없을때 뒤에서
            for (int i = M-1; i >=0 ; i--) {//hierarchy
                int temp = hierarchy.get(i);
                for (int j = N-1; j >=0 ; j--) {
                    if(!milk.contains(temp) ){
                        milk.set(milk.lastIndexOf(0),temp);
                        break;
                    }else{
                        break;
                    }

                }
            }
        }
        for (int i = 0; i < milk.size(); i++) {
            System.out.println(milk.get(i));
        }
        if (milk.contains(1)) {
            System.out.println(milk.indexOf(1) + 1);
        } else {
            System.out.println(milk.indexOf(0) + 1);
        }
    }

}
