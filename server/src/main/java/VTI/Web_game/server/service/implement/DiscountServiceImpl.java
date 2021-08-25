package VTI.Web_game.server.service.implement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VTI.Web_game.server.model.entity.Cart;
import VTI.Web_game.server.model.entity.Discount;
import VTI.Web_game.server.repository.DiscountRepository;
import VTI.Web_game.server.service.CartService;
import VTI.Web_game.server.service.DiscountService;


@Service
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;
    private final CartService cartService;

    @Autowired
    public DiscountServiceImpl(DiscountRepository discountRepository, CartService cartService) {
        this.discountRepository = discountRepository;
        this.cartService = cartService;
    }

	@Override
	public void applyDiscount(String code) {
		// TODO Auto-generated method stub
		
	}

//    @Override
//    public void applyDiscount(String code) {
//        Discount discount = discountRepository.findByCode(code).orElseThrow(() -> new ResourceNotFoundException("Discount code not found"));
//
//        if (discount.getStatus() != 1) {
//            throw new InvalidArgumentException("Discount code is expired!");
//        }
//
//        Cart cart = cartService.getCart();
//
//        cart.setDiscount(discount);
//        cart = cartService.calculatePrice(cart);
//        cartService.saveCart(cart);
//    }
}
