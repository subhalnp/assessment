package question2;

public class TicketPriorityQueue {

    private static class Ticket{
        private int priority;
        private int ticketId;
        public Ticket(int priority, int ticketId) {
            this.priority = priority;
            this.ticketId = ticketId;
        }

    }

    private Ticket[] arrTicketHeap;
    private int arrTicketSize;

    public TicketPriorityQueue() {
        this.arrTicketSize = 0;
        this.arrTicketHeap = new Ticket[3];
    }

    public void addTicket(int ticketId, int priority) {
        arrTicketHeap[arrTicketSize] = new Ticket(priority, ticketId);
        modifyHeapOnAdd(arrTicketSize); // Moves the newly added element up to maintain the heap property
        arrTicketSize++;
    }

    //newly added element and compare with parent interchange  based on priority
    private void modifyHeapOnAdd(int newChildIndex) {
        int parentIndex = (newChildIndex - 1) / 2;
        if(arrTicketHeap[newChildIndex].priority < arrTicketHeap[parentIndex].priority){
            interChange(newChildIndex, parentIndex);
            newChildIndex = parentIndex;
        }

    }

    private void interChange(int newChildIndex, int parentIndex) {
        Ticket tempTicket = arrTicketHeap[newChildIndex];
        arrTicketHeap[newChildIndex] = arrTicketHeap[parentIndex];
        arrTicketHeap[parentIndex] = tempTicket;
    }


    public int getNextTicket(){
        if(arrTicketSize == 0)
            return -1;   // as stated in the requirement

        int highestPriorityTicket = arrTicketHeap[0].ticketId;
        arrTicketHeap[0] = arrTicketHeap[arrTicketSize - 1];
        arrTicketSize--;
        modifyHeapOnRemove(0);
        return highestPriorityTicket;
    }

    private void modifyHeapOnRemove(int removeIndex) {
        while(true) {
            int leftChildIndex = 2 * removeIndex + 1;
            int rightChildIndex = 2 * removeIndex + 2;
            int highestPriorityIndex = removeIndex;

            //After removing the current highest priority , deciding on which node is moving to that place
            if (arrTicketHeap[leftChildIndex].priority < arrTicketHeap[removeIndex].priority) {
                highestPriorityIndex = leftChildIndex;
            }

            if (arrTicketHeap[rightChildIndex].priority < arrTicketHeap[removeIndex].priority) {
                highestPriorityIndex = rightChildIndex;
            }

            if (highestPriorityIndex == removeIndex) {
                break;
            }
            interChange(removeIndex, highestPriorityIndex);
            removeIndex = highestPriorityIndex;
        }


    }
}
