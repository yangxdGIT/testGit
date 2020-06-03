//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
// 例如，给出 n = 3，生成结果为：
//
// [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
//
// Related Topics 字符串 回溯算法


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recur(0,2*n,"");
        return result;
    }
    public void  recur(int level,int n,String s){
        if(level>=n){
            return ;
        }
        String s1 = s+"(";
        String s2 = s+")";
//        result.add(s1);
//        result.add(s2);
        recur(level+1,n,s1);
        recur(level+1,n,s2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(5));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
