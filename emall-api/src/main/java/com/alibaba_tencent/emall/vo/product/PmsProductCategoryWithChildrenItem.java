package com.alibaba_tencent.emall.vo.product;


import com.alibaba_tencent.emall.pms.entity.ProductCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory  implements Serializable {



    private List<ProductCategory> children;

}
