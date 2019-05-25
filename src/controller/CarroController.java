/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import model.Carro;
import java.util.ArrayList;


/**
 *
 * @author lukas.camargo
 */
public class CarroController {
    
    public static boolean salvar(String pModelo, int pAno, double pValor){
        Carro p = new Carro(pModelo, pAno, pValor);
        return DAO.salvar(p);
    }
    
    public static boolean excluir(int pID){
        return DAO.excluir(pID);
    }
    
    public static boolean atualizar(int pId, String pModelo, int pAno, double pValor){
        Carro p = new Carro(pId, pModelo, pAno, pValor);
        return DAO.atualizar(p);
    }
    
    public static ArrayList<String[]> getCarros(){
        ArrayList<Carro> carros = DAO.getCarros();
        ArrayList<String[]> listaCarros = new ArrayList<>();
        
        for(int i=0; i<carros.size();i++){
            listaCarros.add(new String[]{
                String.valueOf(carros.get(i).getId()),
                carros.get(i).getModelo(),
                String.valueOf(carros.get(i).getAno()),
                String.valueOf(carros.get(i).getValor())
            });
        }
        
        return listaCarros;
    }
    
}
