package com.url.shortener.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.url.shortener.models.UrlMapping;
import com.url.shortener.models.User;

public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {

    UrlMapping findByShortUrl(String shortUrl);
    List<UrlMapping> findByUser(User user);
}
