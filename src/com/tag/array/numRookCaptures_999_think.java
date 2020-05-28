package com.tag.array;

public class numRookCaptures_999_think {
    public static void main(String[] args){
        char[][] board = {{'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};

        int pre = 0,x = 0,y = -1,count = 0;
        for (int i = 0; i < 8; i++) {
            pre = 0;
            for (int j = 0; j < 8; j++) {
                if (pre < 0 && y >= 0 && !('.' == board[i][j])){
                    if (board[i][j] == 'p') count++;
                    System.out.println("i:"+i+",j:"+j);
                    System.out.println("右,count:"+count);
                    i = 8;
                    j = 8;
                    break;
                }
                if ('R' == board[i][j]){
                    x = j; y = i;
                    if (pre == 2) count++;
                    System.out.println("左,count:"+count);
                    pre = -1;
                }
                if (pre >= 0 && !('.' == board[i][j])){
                    if ('B' == board[i][j]){
                        pre = 1;
                    }else {
                        System.out.println("i:"+i+",j:"+j);
                        pre = 2;
                    }
                }
            }
        }

        pre = 0;
        for (int i = 0; i < 8; i++) {
            if (pre < 0 && !('.' == board[i][x])){
                if (board[i][x] == 'p') count++;
                System.out.println("i:"+i+",j:"+x);
                System.out.println("下,count:"+count);
                break;
            }
            if (i == y){
                if (pre == 2) count++;
                System.out.println("上,count:"+count);
                pre = -1;
            }
            if (pre >= 0 && i < y && !('.' == board[i][x])){
                if ('B' == board[i][x]){
                    pre = 1;
                }else {
                    System.out.println("i:"+i+",j:"+x);
                    pre = 2;
                }
            }
        }

        System.out.println(count);
    }
}
