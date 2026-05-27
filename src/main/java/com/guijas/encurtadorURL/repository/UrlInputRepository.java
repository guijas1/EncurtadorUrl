package com.guijas.encurtadorURL.repository;

import com.guijas.encurtadorURL.entity.UrlInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlInputRepository extends JpaRepository<UrlInput,Long> {



}
