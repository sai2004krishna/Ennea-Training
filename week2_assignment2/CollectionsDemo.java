import java.util.*;

public class CollectionsDemo {
    
    public static void ListDemo(Scanner sc) {
        List<Integer> list = new ArrayList<>();
        
        
        int choice = -1;
        while(choice != 0) {
            System.out.println("\nList Operations:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Search element");
            System.out.println("4.View List Elements");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int elementToAdd = sc.nextInt();
                    list.add(elementToAdd);
                    System.out.println("Added: " + elementToAdd);
                    break;
                    
                case 2:
                    System.out.print("Enter element to remove: ");
                    int elementToRemove = sc.nextInt();
                    list.remove(elementToRemove);
                    break;
                    
                case 3:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = sc.nextInt();
                    if (list.contains(elementToSearch)) {
                        System.out.println("Element found: " + elementToSearch);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                
                case 4:
                    System.out.println("List Elements are :");
                    for(int c:list)
                    {
                        System.out.print(c+" ");
                    }
                    
                case 0:
                    System.out.println("Exiting List operations...");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
    
    
    public static void SetDemo(Scanner sc) {
        Set<String> set = new HashSet<>();
       
        
        int choice = -1;
        while(choice != 0) {
            System.out.println("\nSet Operations:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Search element");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch(choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = sc.nextLine();
                    set.add(elementToAdd);
                    break;
                    
                case 2:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = sc.nextLine();
                    set.remove(elementToRemove);
                    break;
                    
                case 3:
                    System.out.print("Enter element to search: ");
                    String elementToSearch = sc.nextLine();
                    if (set.contains(elementToSearch)) {
                        System.out.println("Element found: " + elementToSearch);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                    
                case 0:
                    System.out.println("Exiting Set operations...");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
       
    }

  
    public static void MapDemo(Scanner sc) {
        Map<Integer, String> map = new HashMap<>();
       
        
        int choice = -1;
        while(choice != 0) {
            System.out.println("\nMap Operations:");
            System.out.println("1. Add key-value pair");
            System.out.println("2. Remove key-value pair");
            System.out.println("3. Search by key");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter key (integer): ");
                    int keyToAdd = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter value: ");
                    String valueToAdd = sc.nextLine();
                    map.put(keyToAdd, valueToAdd);
                    break;
                    
                case 2:
                    System.out.print("Enter key to remove: ");
                    int keyToRemove = sc.nextInt();
                    sc.nextLine(); 
                    map.remove(keyToRemove);
                    break;
                    
                case 3:
                    System.out.print("Enter key to search: ");
                    int keyToSearch = sc.nextInt();
                    sc.nextLine(); 
                    if (map.containsKey(keyToSearch)) {
                        System.out.println("Found: " + keyToSearch + " -> " + map.get(keyToSearch));
                    } else {
                        System.out.println("Key not found");
                    }
                    break;
                    
                case 0:
                    System.out.println("Exiting Map operations...");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        while (i > 0) {
            System.out.println("\nChoose a Collection to work with:");
            System.out.println("1. List");
            System.out.println("2. Set");
            System.out.println("3. Map");
            System.out.println("0. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    ListDemo(sc);
                    break;
                
                case 2:
                    SetDemo(sc);
                    break;

                case 3:
                    MapDemo(sc);
                    break;

                case 0:
                    i = 0;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
