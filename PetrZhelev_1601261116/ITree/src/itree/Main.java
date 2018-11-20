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
public class Main {
 
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1, "1");
        tree.insert(3, "3");
        tree.insert(8, "8");
        tree.insert(2, "2");
        tree.insert(4, "4");
        tree.insert(0, "0");
 
        Node find = tree.find(1);
        System.out.println("Element with key: 1");
        find.printNode(); 
        System.out.println("\n");
        tree.print(find);
    }
}
