/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_service;

import com.werapan.databaseproject.model.Reciept;
import com.werapan.databaseproject.service.RecieptService;

/**
 *
 * @author nonku
 */
public class TestRecieptService {

    public static void main(String[] args) {
        RecieptService recieptService = new RecieptService();
        for (Reciept reciept : recieptService.getReciepts()) {
            System.out.println(reciept);
        }
        System.out.println(recieptService.getById(1));
        Reciept r1 = new Reciept(100, 100, 1, 10, 1);
        recieptService.addNew(r1);
        
        for (Reciept reciept : recieptService.getReciepts()) {
            System.out.println(reciept);
        }

    }
}
