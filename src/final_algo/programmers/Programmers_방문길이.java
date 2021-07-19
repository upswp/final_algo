package final_algo.programmers;

public class Programmers_방문길이 {
    static class Solution {
        public static boolean visit[][][][];
        public static int dx [] = {0,0,1,-1};
        public static int dy [] = {-1,1,0,0};

        public int solution(String dirs) {
            int answer = 0;
            int x, y , index= 0;
            int nX = 5;
            int nY = 5;
            visit = new boolean[11][11][11][11];

            for (int i = 0; i < dirs.length(); i++) {
                x = nX;
                y = nY;
                if(dirs.charAt(i) == 'U'){
                    index = 0;
                }else if(dirs.charAt(i) == 'D'){
                    index = 1;
                }else if(dirs.charAt(i) == 'R'){
                    index = 2;
                }else if(dirs.charAt(i) == 'L'){
                    index = 3;
                }
                nX += dx[index];
                nY += dy[index];

                if(nX < 0 || nY < 0 || nX > 10 || nY > 10){
                    nX -= dx[index];
                    nY -= dy[index];
                    continue;
                }
                if(!visit[x][y][nX][nY] && !visit[nX][nY][x][y]){
                    visit[x][y][nX][nY] = true;
                    visit[nX][nY][x][y] = true;
                    answer ++;
                }
            }
            return answer;
        }
    }
}
