package com.leospiritlee.base.equalshashcode;

/**
 * output:
 * 反身性：对于任何 x， x.equals(x) 应该返回 true。
 * 对称性：对于任何 x 和 y， x.equals(y) 应该返回 true当且仅当 y.equals(x) 返回 true 。
 * 传递性：对于任何x,y,还有z，如果 x.equals(y) 返回 true 并且 y.equals(z) 返回 true，那么 x.equals(z) 应该返回 true。
 * 一致性：对于任何 x和y，在对象没有被改变的情况下，多次调用 x.equals(y) 应该总是返回 true 或者false。
 * 对于任何非null的x，x.equals(null)应该返回false。
 */
public class DefaultComparison {

    private int i, j, k;
    DefaultComparison(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public static void main(String[] args) {
        DefaultComparison
                a = new DefaultComparison(1, 2, 3),
                b = new DefaultComparison(1, 2, 3);
        System.out.println(a == a);
        System.out.println(a == b);
    }

}
