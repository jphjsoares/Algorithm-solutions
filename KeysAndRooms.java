class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0); //add 0 to our visited hashset
        
        //Represents all the rooms we have access to atm
        Stack<Integer> stack = new Stack<>(); 
        stack.add(0); 
        
        while(!stack.isEmpty()){
            List<Integer> keys = rooms.get(stack.pop()); //get the keys of the active room
            for(int key : keys) {
                //If key hasn't been used to visit a room
                if(!visited.contains(key)){
                    visited.add(key); //Mark the respective room as visited
                    stack.add(key); //Add the room to the stack so that we can get their keys
                }
            }
        }
        return visited.size() == rooms.size();
    }
}