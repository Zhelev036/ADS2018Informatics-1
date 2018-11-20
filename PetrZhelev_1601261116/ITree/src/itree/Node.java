/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itree;

/**
 *
 * @author Admin
 */
public class Node {
 
    public int key; //ключ узла
    public String data; //некоторые данные в узле
    public Node leftChild; //левый потомок
    public Node rightChild; //правый потомок
 
    /**
     * Метод который выводит на экран содержимое узла
     */
    public void printNode(){
        System.out.println("KEY:  " + key + "| DATA: - " + data);
    }
}
