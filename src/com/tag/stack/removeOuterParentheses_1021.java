package com.tag.stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class removeOuterParentheses_1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        int floor = 0;
        for (char c : S.toCharArray()){
            if(floor == 1 && c == ')'){
                floor = 0;
            }
            else if (c == ')'){
                ans.append(c);
                floor--;
            }else{
                if(floor != 0) ans.append(c);
                floor++;
            }
        }

        return ans.toString();
    }


    //该题用栈效率低下
    //    public String removeOuterParentheses(String S) {
    //        StringBuilder ans = new StringBuilder();
    //        Stack<Character> stack = new Stack<>();
    //
    //        int start = 0;// 初始化原语的起始位置
    //        int end = 0;// 初始化原语的结束位置
    //        boolean flag = false;// 标志每个原语
    //
    //        for (int i = 0;i < S.length();i++) {
    //            char ch = S.charAt(i);
    //
    //            if (ch == '(') {// 遇到左括号，入栈
    //                stack.push(ch);
    //                if (!flag) {// 遇到的第一个左括号，是原语的开始位置，记录下原语开始位置
    //                    start = i;
    //                    flag = true;
    //                }
    //            }
    //
    //            if (ch == ')') {// 遇到右括号，出栈
    //                stack.pop();
    //                if (stack.isEmpty()) {// 当栈空的时候，找到了一个完整的原语
    //                    end = i;// 记录下结束位置
    //                    ans.append(S.substring(start + 1,end));// 去掉原语的最外层括号，并追加到答案中
    //                    flag = false;// 置标志为false，往后接着找下一个原语
    //                    start = end;// 往后找，再次初始化原语开始位置
    //                }
    //            }
    //        }
    //
    //        return ans.toString();
    //    }
}
