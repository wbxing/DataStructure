package java.com.data.structure.recursion;

/**
 * 背包问题
 * 将不同重量的数据项放到背包中，以使得背包最后达到指定的总重量
 *
 * 选择的第一个数据项，剩余数据项的和必须符合背包的目标重量减去第一个数据项的重量，这是一个新的目标重量
 * 逐个尝试每种剩余数据项组合的可能性，过程中只要数据项的和大于目标重量的时候，就可以停止添加数据
 * 如果没有合适的组合，放弃第一个数据项，并且从第二个数据项开始再重复一遍整个过程
 * 依次重复以上过程，任何时刻，选择的数据项的总和符合目标重量，工作完成
 * 直到尝试了所有的组合
 */
public class Knapsack {
    // 重量组合
    private int[] weight;
    // 该重量是否被选中
    private boolean [] select;

    public Knapsack(int[] weight) {
        this.weight = weight;
        this.select = new boolean[this.weight.length];
    }

    /**
     * 找出符合承重的组合
     * @param total 总承重
     * @param index 可供选择的重量的下标
     */
    public void knapsack(int total,int index) {
        if (total < 0 || total > 0 && index >= this.weight.length) {
            // 此时没有解决方案，直接返回
            return;
        }
        if (total == 0) {
            // 得到解决方案
            for (int i = 0; i < index; i++) {
                if (this.select[i]) {
                    System.out.print(this.weight[i] + "  ");
                }
            }
            System.out.println();
            return;
        }
        this.select[index] = true;
        this.knapsack(total - this.weight[index], index + 1);
        this.select[index] = false;
        knapsack(total, index + 1);
    }
}
