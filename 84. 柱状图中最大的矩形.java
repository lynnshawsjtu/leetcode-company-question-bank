class Solution {
    public int largestRectangleArea(int[] heights) {
        //单调栈
        //在柱体数组的头和尾加了两个高度为0的主题
        int[] tmp=new int[heights.length+2];
        System.arraycopy(heights,0,tmp,1,heights.length);
        Deque<Integer> stack=new ArrayDeque<>();
        int area=0;
        for(int i=0;i<tmp.length;++i){
            while(!stack.isEmpty()&&tmp[i]<tmp[stack.peek()]){
                int h=tmp[stack.pop()];
                area=Math.max(area,(i-stack.peek()-1)*h);
            }
            stack.push(i);
        }
        return area;
    }
}
