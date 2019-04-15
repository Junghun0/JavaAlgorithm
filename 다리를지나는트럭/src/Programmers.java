import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers {

    public static void main(String[] args) {
        int[] weight = {7, 4, 5, 6};
        new Solution().solution(2, 10, weight);//return ->8
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int onBridgeWeight = 0;
        Queue<Truck> truckQueue = new LinkedList<>();
        for(int truck_weight: truck_weights){
            truckQueue.offer( new Truck( truck_weight ));
        }

        Queue<Truck> truckOnBridgeQueue = new LinkedList<>();
        onBridgeWeight += truckQueue.peek().weight;
        truckOnBridgeQueue.offer(truckQueue.poll());

        int time=0;
        while (!truckOnBridgeQueue.isEmpty()){
            time++;

            for(Truck truck:truckOnBridgeQueue){
                truck.position++;
            }

            if(truckOnBridgeQueue.peek().position > bridge_length){
                onBridgeWeight -= truckOnBridgeQueue.poll().weight;
            }

            if(truckQueue.isEmpty()==false && (onBridgeWeight +  truckQueue.peek().weight <= weight)){
                onBridgeWeight += truckQueue.peek().weight;
                truckQueue.peek().position++;
                truckOnBridgeQueue.offer( truckQueue.poll() );
            }
        }

        return time;
    }

    public class Truck {

        int position;
        int weight;

        public Truck(int weight) {
            this.position = 0;
            this.weight = weight;
        }

    }
}