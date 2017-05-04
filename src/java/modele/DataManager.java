/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author edson
 */
public class DataManager {
    
    public static ArrayList getListe(String gr){
        
        ArrayList liste = new ArrayList();
        for(int i = 1; i<5; i++){
            Etudiant et = new Etudiant();
            et.setNom("Nom"+i+"gr"+gr);
            et.setPrenom("Prenom"+i+"gr"+gr);
            liste.add(et);
        }
        return liste;
    }
}
