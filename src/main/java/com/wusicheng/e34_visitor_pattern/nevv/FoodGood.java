package com.wusicheng.e34_visitor_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class FoodGood extends Good {
    public FoodGood(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.visit(this);
    }
}
