package lv.oxana.rocketshop.ecommerce.service;

import lv.oxana.rocketshop.ecommerce.repository.OrderProduct;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface OrderProductService {

    OrderProduct create(@NotNull(message = "The products for order cannot be null.")
                        @Valid OrderProduct orderProduct);
}
