package other;

import java.util.LinkedList;

/**
 * @author yujingyi
 * @date 2023/7/11
 */
public class MiniParser {

//  public NestedInteger deserialize(String s) {
//    if (s.charAt(0) != '[') {
//      return new NestedInteger(Integer.parseInt(s));
//    }
//    Deque<NestedInteger> stack = new LinkedList<NestedInteger>();
//    int num = 0;
//    boolean negative = false;
//    for (int i = 0; i < s.length(); i++) {
//      char c = s.charAt(i);
//      if (c == '-') {
//        negative = true;
//      } else if (Character.isDigit(c)) {
//        num = num * 10 + c - '0';
//      } else if (c == '[') {
//        stack.push(new NestedInteger());
//      } else if (c == ',' || c == ']') {
//        // 如果前一位是数字，则将数字入栈
//        if (Character.isDigit(s.charAt(i - 1))) {
//          if (negative) {
//            num *= -1;
//          }
//          stack.peek().add(new NestedInteger(num));
//        }
//        num = 0;
//        negative = false;
//        if (c == ']' && stack.size() > 1) {
//          NestedInteger ni = stack.pop();
//          stack.peek().add(ni);
//        }
//      }
//    }
//    return stack.pop();
//  }

}

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
