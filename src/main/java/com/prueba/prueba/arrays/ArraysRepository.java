/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.prueba.prueba.arrays;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Johan Castro - 2023/24/01
 */
@Repository
public interface ArraysRepository extends JpaRepository<Arrays, Long> {
    
    
}
