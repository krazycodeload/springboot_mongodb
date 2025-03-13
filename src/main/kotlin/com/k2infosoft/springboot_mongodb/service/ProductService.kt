package com.k2infosoft.springboot_mongodb.service

import com.k2infosoft.springboot_mongodb.model.Product
import com.k2infosoft.springboot_mongodb.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(@Autowired private val productRepository: ProductRepository) {

    fun getAllProducts(): List<Product> = productRepository.findAll()

    fun getProductById(id: String): Optional<Product> = productRepository.findById(id)

    fun addProduct(product: Product): Product = productRepository.save(product)

    fun updateProduct(id: String, product: Product): Optional<Product> {
        if (productRepository.existsById(id)) {
            return Optional.of(productRepository.save(product))
        }
        return Optional.empty()
    }

    fun deleteProduct(id: String) {
        productRepository.deleteById(id)
    }
}