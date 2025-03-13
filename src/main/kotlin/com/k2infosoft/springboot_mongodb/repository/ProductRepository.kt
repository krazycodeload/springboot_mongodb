package com.k2infosoft.springboot_mongodb.repository

import com.k2infosoft.springboot_mongodb.model.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : MongoRepository<Product, String> {
    fun findByName(name: String): List<Product>
}