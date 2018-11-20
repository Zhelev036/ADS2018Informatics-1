/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindistance;

/**
 *
 * @author Admin
 */
public class MinDistance {

    /**
     * @param args the command line arguments
     */
     public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));   // Вернуть квадратный корень расстояния в квадрате
     }
    public static void main(String[] args) {
       double p1 =  getDistance(1,7,5,11); // Первые 2 точки с координатами 1,7 и 5,11 
       double p2 = getDistance(2,10,3,7); // Вторые 2 точки с координатами 2,10 и 3,7 
       
       if(p1<p2) // Если растояние первых точек меньше расстояния вторых 
       {
           System.out.println("Minimum distance from points: "+p1); // Минимальное расстояние точек 1
       }
       else
       {
           System.out.println("Minimum distance from points: "+p2); // Минимальное расстояние точек 2
       }
       
         
    }
    
}
