package vn.edu.iuh.fit.wwwlab02.services;

import vn.edu.iuh.fit.wwwlab02.entities.ProductPrice;
import vn.edu.iuh.fit.wwwlab02.repositories.ProductPriceRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ProductPriceService {
    private final ProductPriceRepository repo = new ProductPriceRepository();

    public ProductPriceService() {

    }

    public boolean insertProductPrice(ProductPrice productPrice) {
        return repo.insertProductPrice(productPrice);
    }

    public boolean updateProductPrice(ProductPrice productPrice) {
        return repo.updateProductPrice(productPrice);
    }

    public Optional<ProductPrice> findProductPrice(long id, LocalDateTime dateTime) {
        return repo.findProductPrice(id, dateTime);
    }

    public boolean deleteProductPrice(long id, LocalDateTime dateTime) {
        return repo.deleteProductPrice(id, dateTime);
    }

    public List<ProductPrice> getAllProductPrice() {
        return repo.getAllProductPrice();
    }
    public List<ProductPrice> findByIdNotDate(Long id){
        return repo.findByIdNotDate(id);
    }
}
