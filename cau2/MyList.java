import java.util.*;

public class MyList {
	private int N; //Do dai danh sach
	private Node start;
	private Node end;
	public int length(){
		return N;
		}
	public MyList(){
		start = null;
		end = null;
		}
	public boolean isEmpty(){
		return first = null;
		}
	public void append(Item item){
		Node x = new Node();
		x.item = item;
		if(isEmpty()) {start = x; last = x;}
		else          {last.next = x; last = x;}
		N++;
		}
	public void appendList(MyList){
		return this.append();
		}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (Item item : this)
			s.append(item + " ");
			return s.toString();
		}
	
	
	
	
	
	public static void main(String[] args) {
        MyList<String> q = new MyList<String>();
        while ( !StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) q.enqueue(item);
            else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");
    }
}