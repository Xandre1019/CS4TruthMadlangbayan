/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05truthmadlangbayan;

/**
 *
 * @author TRUTH
 */
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    name = this.name;
    earnings = 0.00;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }
  
  public String getName(){
    return name;
  }
  public int getEarnings(){
    return (int) earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index + 1 <= itemList.size()) {
        System.out.println("We do have that item here.");
        }
    
    else {
        System.out.println("We only have " + itemList.size() + " items. Sorry.");
        }
    // get Item at index from itemList and add its cost to earnings
    Item sold_item = itemList.get(index);
    double cost = sold_item.getCost();
    earnings += cost;
    // print statement indicating the sale
    System.out.println("We have sold 1 " + sold_item + " at " + earnings);
  }
  public void sellItem(String name){
    Item sold_item = null;
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    for(int i=0; i < itemList.size(); i++) {
        if(itemList.get(i).getName().equals(name)) {
            System.out.println("We do have that item here.");
            sold_item = itemList.get(i);
            }
        
        else {
            System.out.println("We don't sell that here. Sorry.");
            }
        }
    // get Item from itemList and add its cost to getEarnings
     earnings += sold_item.getCost();
    // print statement indicating the sale
    System.out.println("We have sold 1 " + sold_item + " at " + earnings);
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    Item sold_item = null;
    for(int n=0; n < itemList.size(); n++) {
        if(itemList.contains(i)) {
            System.out.println("We do have that item here.");
            sold_item = itemList.get(n);
            }
        
        else {
            System.out.println("We don't sell that here. Sorry.");
            }
        }
    
    // get Item i from itemList and add its cost to getEarnings
    earnings += sold_item.getCost();
    // print statement indicating the sale
    System.out.println("We have sold 1 " + i + " at " + earnings);
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    Item new_item = null;
    for(int i=0; i < itemList.size(); i++) {
        if(itemList.get(i).getType().equals(type)) {
            new_item = itemList.get(i);
            System.out.print(" | " + new_item.getName());
            }
        
        else {
            break;
            }
        }
    System.out.print("\n");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    Item new_item = null;
    for(int i=0; i < itemList.size(); i++) {
        if(itemList.get(i).getCost() <= maxCost) {
            new_item = itemList.get(i);
            System.out.print(" | " + new_item.getName());
            }
        
        else {
            break;
            }
        }
    System.out.print("\n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    Item new_item = null;
    for(int i=0; i < itemList.size(); i++) {
        if(itemList.get(i).getCost() >= minCost) {
            new_item = itemList.get(i);
            System.out.print(" | " + new_item.getName());
            }
        
        else {
            break;
            }
        }
    System.out.print("\n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(int i=0; i < storeList.size(); i++) {
        String name = storeList.get(i).getName();
        double earnings = storeList.get(i).getEarnings();
        System.out.println(name + ": " + earnings);
        }
  }
}
