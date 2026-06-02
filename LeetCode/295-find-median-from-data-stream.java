class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        this.minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        // the difference between the size of the two heaps should not be more than 1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            int sum = maxHeap.peek() + minHeap.peek();
            double mean = (double) sum / 2;
            return mean;
        }

        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */