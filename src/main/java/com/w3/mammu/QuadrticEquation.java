package com.w3.mammu;

public class QuadrticEquation {
    public RootsOfQuadrticEquation hasQuadraticRoots(int a, int b, int c){
        double  value = Math.sqrt((b*b) -(4*a*c));
        double root1 = (-b+value)/(2*a);
        double root2 =  (-b-value)/(2*a);
        RootsOfQuadrticEquation rqe = new RootsOfQuadrticEquation();
        rqe.setRoot1(root1);
        rqe.setRoot2(root2);
        return rqe;

    }

}