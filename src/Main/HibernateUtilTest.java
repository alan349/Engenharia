/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Hibernate.NewHibernateUtil;

import java.util.List;

/**
 *
 * @author Alan
 */
public class HibernateUtilTest {
    public static void main(String [] args){
        NewHibernateUtil.getSessionFactory();
    }
}
