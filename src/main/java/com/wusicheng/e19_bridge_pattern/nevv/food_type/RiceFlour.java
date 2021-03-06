package com.wusicheng.e19_bridge_pattern.nevv.food_type;

import com.wusicheng.e19_bridge_pattern.nevv.papper_type.IPapperType;
import com.wusicheng.e19_bridge_pattern.nevv.weight_type.IWeightType;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class RiceFlour implements IFoodType {

    private IPapperType papperType;
    private IWeightType weightType;

    public RiceFlour(IPapperType papperType, IWeightType weightType) {
        this.papperType = papperType;
        this.weightType = weightType;
    }

    @Override
    public void getFoodType() {
        System.out.println("粉");
    }

    @Override
    public void want() {
        papperType.getPapperType();
        weightType.getWeightType();
        getFoodType();
    }
}
