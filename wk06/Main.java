import java.util.Collections;
import java.util.LinkedList;

class Main{
    public static void main(String args[])
	{
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(1);
        llist.add(3);
        llist.add(5);
        llist.add(11);
        llist.add(7);
        llist.add(9);

        System.out.println("Linked List before addAndSort");
        System.out.println(llist);

        addAndSort(llist, 15);
        addAndSort(llist, 8);

        System.out.println("\nLinked List after addAndSort");
        System.out.print(llist);

        int element1 = 3;
        int element2 = 11;
        System.out.println();
        System.out.println();
        System.out.println("Linked List Before Swapping :");
        System.out.print(llist);

        // Swapping the elements
        swap(llist, element1, element2);
        System.out.println();
        System.out.println();
  
        System.out.println("Linked List After Swapping :");
  
        System.out.print(llist);
	}

    node head;
    node sort;

	class node{
        int data;
        node next;
        public node(int d){
            this.data = d;
            next = null;
        }
    }

    void add(int d){
        node newNode = new node(d);
        newNode.next = head;
        head = newNode;
    }

	void sortedInsert(node newNode)
	{
		if (sort == null || sort.data >= newNode.data){
            newNode.next = sort;
            sort = newNode;
        } else {
            node current = sort;
            while(current.next != null && current.next.data < newNode.data){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
	}

	void sortCurrentList(node headIndex){
        sort = null;
        node current = headIndex;
        while (current != null){
            node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sort;
    }

	/* Function to print linked list */
	void printList(node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static LinkedList<Integer> addAndSort(LinkedList<Integer> list, int val){
        list.add(val);
        Collections.sort(list);
        return list;
    }
    
    public static void swap(LinkedList<Integer> list, int ele1, int ele2){
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
        if (index1 == -1 || index2 == -1) {
            return;
        }
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}

