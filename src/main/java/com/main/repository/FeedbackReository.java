package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Feedback;
import com.main.model.ShipmentService;


@Repository
public interface FeedbackReository extends JpaRepository<Feedback, Integer> {

}
