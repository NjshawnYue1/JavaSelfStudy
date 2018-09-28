/**
 * Created by Admin on 2017/9/23.
 */

/*
* 雇员示例
* 需求：公司中程序员有姓名 工号 薪水 工作内容
* 项目经理有姓名 工号 薪水 工作内容 奖金
* */
abstract class Employee{
    private String name;
    private int num;
    private double cash;
    Employee(String name,int num,double cash){
        this.name = name;
        this.num = num;
        this.cash = cash;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
   abstract public void work();

}

class Programmer extends Employee {
    Programmer(String name, int num, double cash) {
        super(name, num, cash);
    }

    public void work() {
        System.out.println("code");
    }
}
class Manager extends Employee{
        private double bouns;
        Manager(String name,int num,double cash){
            super(name,num,cash);
            this.bouns = bouns;
        }
        public void work(){
            System.out.println("manage");
        }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Programmer p = new Programmer("Gg",11,10);
        p.work();
        new Manager("aa",20,30).work();

    }
}