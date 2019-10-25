package com.data.structure.recursion;

/**
 * 组合
 * 从五个队员中选择三个队员去登峰
 *
 * 首先这五个人的组合选择三个人分成两个部分，第一部分包含A队员，第二部分不包含A队员
 * 规定 n 是一群人的大小，并且 k 是组队的规模
 * 假设把从 5 个人中选出 3 个人的组合简写为 (5, 3)，那么则有：(n, k) = (n-1, k-1) + (n-1, k)
 * 对于从 5 个人中选择 3 个人，有：(5, 3) = (4, 2) + (4, 3)
 * (4,2)表示已经有 A 队员了，然后从剩下的 4 个队员中选择 2 个队员
 * (4,3)表示从 5 个人中剔除 A 队员，从剩下的 4 个队员中选择 3 个队员
 * 接下来考虑从 4 个人的人群中选择 2 个人，又可以表示为：(4, 2) = (3, 1) + (3, 2)
 */
public class Combination {
    // 组合中可被选择的人
    private char[] person;
    // 该队员是否被选中
    private boolean[] select;

    public Combination(char[] person) {
        this.person = person;
        this.select = new boolean[this.person.length];
    }

    /**
     * 选择的组合
     *
     * @param teamNumber 需要选出的人数
     * @param index      选中的下标
     */
    public void combination(int teamNumber, int index) {
        if (teamNumber == 0) {//当teamNumber=0时，找到一组
            for (int i = 0; i < this.select.length; i++) {
                if (this.select[i]) {
                    System.out.print(this.person[i] + "  ");
                }
            }
            System.out.println();
            return;
        }
        //index超过组中人员总数，表示未找到
        if (index >= this.person.length) {
            return;
        }
        this.select[index] = true;
        combination(teamNumber - 1, index + 1);
        this.select[index] = false;
        combination(teamNumber, index + 1);
    }
}