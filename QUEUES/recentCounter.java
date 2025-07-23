package QUEUES;
import java.util.LinkedList;
import java.util.Queue;
public class recentCounter {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println("Pings in the last 3000ms: " + recentCounter.ping(1)); // Output: 1
        System.out.println("Pings in the last 3000ms: " + recentCounter.ping(100)); // Output: 2
        System.out.println("Pings in the last 3000ms: " + recentCounter.ping(3001)); // Output: 3
        System.out.println("Pings in the last 3000ms: " + recentCounter.ping(3002)); // Output: 3
    }
}


class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()< t-3000) q.poll();
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */