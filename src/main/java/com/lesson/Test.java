package com.lesson;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        createData();
        int x = 0;
//        int[] arrs = {18, 4, 8, 9, 16, 1, 14,
//                7, 19, 3, 0, 5, 2, 11, 6};
       Integer[] arrs = createData();
       long start = System.currentTimeMillis();
//        while (loop1(arrs, x)) {
////            x++;
////        }
             x=  loop2(arrs, x);

        long end = System.currentTimeMillis();

       System.out.println(x);
        System.out.println(end-start);
    }

    private static Integer[] createData() {
        Random ran = new Random();

        HashSet<Integer> datas = new HashSet<Integer>();
        for (int i = 0; i < 10000000; i++) {
//            int value = ran.nextInt(1000000);
            datas.add(i);


        }
//        System.out.println(datas.size());

//        System.out.println(datas.size());
//        for (Object o : datas.toArray()) {
//            System.out.println(o);
//        }
        Integer[] as = new Integer[datas.size()];
        return datas.toArray(as);

    }

    private static boolean loop1(Integer[] arrs, int x) {
        boolean result = false;
        for (int i = 0; i < arrs.length; i++) {
            if (x == arrs[i]) {
                result = true;

            }
        }
        return result;
    }
    private static int loop2(Integer[] arrs, int x) {
        Boolean bools[] = new Boolean[arrs.length+1];
    for (int i=0;i<bools.length;i++){
        bools[i]= false;
    }

        int result = 0;
        for (int i = 0; i < arrs.length; i++) {
              if (i<arrs.length+1){
                  bools[i]=true;
              }

        }
        for (int i = 0; i < bools.length; i++) {
            if (!bools[i]){
                result  =i;
                break;
            }

        }
        return result;
    }
}
