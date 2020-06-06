package com.tag.array;

public class tictactoe_1275 {
    public static void main(String[] args){
        int[][] moves = {};
        int[] count = new int[8];
        for (int i = moves.length % 2 == 1 ? 0 : 1; i < moves.length; i+=2) {
            count[moves[i][0]]++;
            count[moves[i][1]+3]++;
            if (moves[i][0] == moves[i][1]) count[6]++;
            if (moves[i][0] + moves[i][1] == 2) count[7]++;
            //if (count[moves[i][0]] == 3 || count[moves[i][1]+3] == 3
            //        || count[6] == 3 || count[7] == 3) return i % 2 == 1 ? "A" : "B";
        }
        //if (moves.length < 9) return "Pending";
        //return "Draw";
    }
}
