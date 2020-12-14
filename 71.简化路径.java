class Solution {
    public String simplifyPath(String path) {
        //栈
        Stack<String> stack=new Stack<>();
        String[] items=path.split("/");
        for(String item:items){
            if(item.isEmpty()||item.equals(".")) continue;
            if(item.equals("..")){
                if(!stack.empty()) stack.pop();
            } else{
                stack.push(item);
            }
        }
        return  "/"+String.join("/",stack);
    }
}
