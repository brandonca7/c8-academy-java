package com.bptn.course._07_polymorphism_in_depth;

public class Add {

    // Create your code here:
    int add(int n1, int n2){
      return n1+n2;
    }

    int add(int n1, int n2, int n3){
      return n1+n2+n3;
    }

    double add(double n1, double n2){
      return n1+n2;
    }

    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));
        System.out.println(obj.add(11, 23, 10));
        System.out.println(obj.add(100.10, 200.5));
    }
}

