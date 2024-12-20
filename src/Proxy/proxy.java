/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import java.util.*;
import java.sql.*;

/**
 *
 * @author eslamsemedo
 */
public class proxy implements database {

    private final database DB = new connection();
    public static final ArrayList<String> access = new ArrayList<>();

    static {
        access.add("eslam");
        access.add("reyad");
        access.add("zeyad");
    }

    public Statement connectBy(String name) {
        if(!access.contains(name)){
            System.out.println("access denied");
            return null;
        }
        return DB.connectBy(name);
    }
}
