package com.fanap.fanapTelecom.rest;


import com.fanap.fanapTelecom.model.*;
import com.fanap.fanapTelecom.repo.BuyRepo;
import com.fanap.fanapTelecom.repo.CommissionRepo;
import com.fanap.fanapTelecom.repo.ProductRepo;
import com.fanap.fanapTelecom.repo.UserRepo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/commission")
public class CommissionRestController {

    private final UserRepo userRepo;
    private final ProductRepo productRepo;
    private final CommissionRepo commissionRepo;
    private final BuyRepo buyRepo;


    public CommissionRestController(UserRepo userRepo, ProductRepo productRepo, CommissionRepo commissionRepo, BuyRepo buyRepo) {
        this.userRepo = userRepo;
        this.productRepo = productRepo;
        this.commissionRepo = commissionRepo;
        this.buyRepo = buyRepo;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/setCommission")
    public void set(@RequestBody Commission commission) {
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getProducts")
    public List<Product> getProduct() {
        final List<Product> all = productRepo.findAll();
        return all;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getReseller")
    public List<User> getReseller() {
        return userRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/postBuy")
    public void buy(@RequestBody Buy buy) {
        productRepo.findById(buy.getId());
        buy.setUser_id(buy.getUser_id());
        buy.setProduct_id(buy.getProduct_id());
        buy.setNumber(buy.getNumber() - 1);
        buyRepo.save(buy);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/putCommission")
    public void commission(@RequestBody Commission commission) {
        Reseller reseller = new Reseller();
        commission.setProduct_id(commission.getProduct_id());
        commission.setUser_id(commission.getUser_id());
        commission.setCommission(commission.getCommission());
        commissionRepo.save(commission);
    }

}
