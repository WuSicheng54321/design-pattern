package com.wusicheng.e19_bridge_pattern.old.food_type;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class Noodles implements IFoodType {
    @Override
    public void getFoodType() {
        System.out.println("面");
    }
}
