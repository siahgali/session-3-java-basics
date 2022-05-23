package com.keep.calm.enjoy.java.b.conditional.and.block.statement.zahra.assignment;

public class Calcul {

        private double num1;
        private double num2;

        public Calcul(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public double calculate(char opr){
            if (opr=='+'){
                return num1+num2;
            }else if (opr=='-'){
                return num1-num2;
            }else if(opr=='*'){
                return num1*num2;
            }else if(opr=='/'){
                return num1/num2;
            }
            return 0;
        }

    }

