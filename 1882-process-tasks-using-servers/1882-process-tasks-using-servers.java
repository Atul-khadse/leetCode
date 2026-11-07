class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {


        int m = tasks.length;
        int[] ans = new int[m];

        PriorityQueue<int[]> freeServers = new PriorityQueue<>((a,b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1], b[1]);
        });



        PriorityQueue<int[]> busyServers = new PriorityQueue<>((a, b) -> {
            if(a[2] != b[2]) return Integer.compare(a[2], b[2]);
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);

            return Integer.compare(a[1], b[1]);
        });


        for(int i =0; i < servers.length; i++){
            freeServers.add(new int[]{servers[i],i,0});
        }


        int time=0;
        int taskId = 0;

        while(taskId < m){
            time = Math.max(time, taskId);

            if(freeServers.isEmpty()){
                time = busyServers.peek()[2];
            }

            while(!busyServers.isEmpty() && busyServers.peek()[2] <= time){
                int[] freed = busyServers.poll();
                freeServers.add(freed);

            }

            while(taskId <= time && taskId < m && !freeServers.isEmpty()){
                int[] server = freeServers.poll();
                ans[taskId] = server[1];

                server[2] = time + tasks[taskId];
                busyServers.add(server);

                taskId++;
            }


        }

        return ans;
        
    }
}