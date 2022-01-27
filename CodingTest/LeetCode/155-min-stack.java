// 빠른방법 4ms - 최소값을 찾기 위해 불필요한 순회를 제거함
class MinStack {
    private List<Integer[]> lists;
    private int min;

    public MinStack() {
        lists = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(lists != null){
            Integer [] mv = {min, val};

            if(min > val){
                min = val;
            }

            lists.add(mv);
        }
    }

    public void pop() {
        if(lists != null && !lists.isEmpty()){
            Integer[] mv = lists.remove(lists.size()-1);
            min = mv[0];
        }
    }

    public int top() {
        if(lists != null && !lists.isEmpty()){
            return lists.get(lists.size()-1)[1];
        }
        return 0;
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


// 느린방법 446ms
class MinStack {
    private List<Integer> lists;

    public MinStack() {
        lists = new ArrayList<>();
    }

    public void push(int val) {
        if(lists != null){
            lists.add(val);
        }
    }

    public void pop() {
        if(lists != null && !lists.isEmpty()){
            lists.remove(lists.size()-1);
        }
    }

    public int top() {
        if(lists != null && !lists.isEmpty()){
            return lists.get(lists.size()-1);
        }
        return 0;
    }

    public int getMin() {
        return Collections.min(lists);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */