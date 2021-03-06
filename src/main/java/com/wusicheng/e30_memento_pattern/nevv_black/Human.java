package com.wusicheng.e30_memento_pattern.nevv_black;


/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class Human {

    /**
     *  年龄
     */
    private int age;

    /**
     *  身高
     */
    private int high;

    /**
     *  体重
     */
    private int weight;

    public Human(int age, int high, int weight) {
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public void growUp(int age, int high, int weight) {
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public IMemento save() {
        return new HumanMemento(this.age, this.high, this.weight);
    }

    public void restore(IMemento memento) {
        this.age = ((HumanMemento)memento).getAge();
        this.high = ((HumanMemento)memento).getHigh();
        this.weight = ((HumanMemento)memento).getWeight();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("age=").append(age);
        sb.append(", high=").append(high);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    private class HumanMemento implements IMemento {
        /**
         *  年龄
         */
        private int age;

        /**
         *  身高
         */
        private int high;

        /**
         *  体重
         */
        private int weight;

        public HumanMemento(int age, int high, int weight) {
            this.age = age;
            this.high = high;
            this.weight = weight;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
