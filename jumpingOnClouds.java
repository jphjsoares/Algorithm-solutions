static int jumpingOnClouds(int[] clouds) {
        int jumps = 0;

        for (int i = 0; i < clouds.length; i++){
            
            //Check for longest possible jump
            if(i+2 < clouds.length && clouds[i+2] == 0) {
                i = i + 1; //We only add 1 because the for loop will add 1 as well
                jumps++;

            //Check for simple jump
            } else if (i+1 < clouds.length && clouds[i+1] == 0) {
                jumps++;
            }
        }


        return jumps;
    }