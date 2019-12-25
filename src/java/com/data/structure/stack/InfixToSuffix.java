package java.com.data.structure.stack;


/**
 * 中缀表达式转换为后缀表达式
 * 利用栈实现
 */
public class InfixToSuffix {
    // 定义运算符栈
    private ArrayStack operator;
    // 定义存储结果栈
    private ArrayStack result;
    // 中缀表达式字符串
    private String infix;

    public InfixToSuffix(String infix) {
        this.infix = infix;
        this.operator = new ArrayStack(this.infix.length());
        this.result = new ArrayStack(this.infix.length());
    }

    // 中缀表达式转换为后缀表达式，将结果存储在栈中返回，逆序显示即后缀表达式
    public ArrayStack doTrans() {
        for (int i = 0; i < this.infix.length(); i++) {
            System.out.print("运算符栈中元素：");
            this.operator.display();
            System.out.print("结果栈中元素：");
            this.result.display();
            // 取出当前需要解析的字符
            char ch = this.infix.charAt(i);
            System.out.println("当前需要解析的字符为：" + ch);
            switch (ch) {
                case '+':
                case '-':
                    gotOperator(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOperator(ch, 2);
                    break;
                case '(':
                    //如果当前字符是'(',则将其入栈
                    this.operator.push(ch);
                    break;
                case ')':
                    gotParen();
                    break;
                default:
                    // 当前解析的是操作数，直接压入结果栈
                    this.result.push(ch);
                    break;
            }
        }
        //
        while (!this.operator.isEmpty()) {
            this.result.push(this.operator.pop());
        }
        return this.result;

    }

    /**
     * 运算符压栈方法
     * @param operator 当前需要处理的运算符
     * @param priority 当前运算符优先级
     */
    public void gotOperator(char operator, int priority) {
        while (!this.operator.isEmpty()) {
            // 强制类型转换
            char onTop = (char) this.operator.peek();
            // 遇到 '+', '-', '*', '/'
            if (onTop != '(') {
                int temp = 0;
                if (onTop == '+' || onTop == '-') {
                    temp = 1;
                } else {
                    temp = 2;
                }
                if (temp >= priority) {
                    // 如果当前运算符没有运算符栈顶运算符优先级高，则将栈顶运算符弹栈后压入结果栈
                    this.result.push(this.operator.pop());
                    // 继续进行循环
                } else {
                    //如果当前运算符比s1栈顶运算符优先级高，直接压入当前运算符
                    break;
                }
            } else {
                // 如果栈顶是 '('，直接压入当前运算符
                break;
            }
        }
        // 将当前运算符压栈
        this.operator.push(operator);
    }

    // 当前字符是 ')' 时，如果栈顶是'(', 则将这一对括号丢弃，否则依次弹出s1栈顶的字符，压入s2，直到遇到'('
    public void gotParen(){
        while(!this.operator.isEmpty()){
            char ch = (char) this.operator.pop();
            if(ch != '('){
                this.result.push(ch);
            }else{
                break;
            }
        }
    }

}
