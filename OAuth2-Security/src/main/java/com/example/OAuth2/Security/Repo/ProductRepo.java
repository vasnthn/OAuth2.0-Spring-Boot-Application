package com.example.OAuth2.Security.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OAuth2.Security.Entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{

}
