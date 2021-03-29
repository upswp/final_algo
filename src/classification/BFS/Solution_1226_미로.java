package classification.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_1226_미로 {

	public static class Point{
		int r;
		int c;
		public Point(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}
	
	public static boolean check(int nr, int nc) {
		return (nr>=0 && nr<16 && nc>=0 && nc<16); 
	}
	
	static int T = 10;
	static int map[][], visit[][], cnt, startR, startC, endR, endC;
	static int dr[] = {-1,0,1,0};
	static int dc[] = {0,-1,0,1};
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 0; t < T; t++) {
			br.readLine();
			map = new int[16][16];
			visit = new int [16][16];
			for (int i = 0; i < 16; i++) {
				char[]input = br.readLine().toCharArray();
				for (int j = 0; j < 16; j++) {
					map[i][j] = input[j]-'0';
				}
			}
			for (int r = 0; r < 16; r++) {
				for (int c = 0; c < 16; c++) {
					if(map[r][c] == 2) {
						startR = r;
						startC = c;
					}else if(map[r][c] ==3) {
						endR = r;
						endC = c;
					}
				}
			}
			
			cnt = 0;
			Queue<Point> que = new LinkedList<>();
			que.offer(new Point(startR, startC));
			visit[startR][startC] = 1;
			while(!que.isEmpty()) {
				Point pt = que.poll();
				for (int d = 0; d < 4; d++) {
					int nr = pt.r + dr[d];
					int nc = pt.c + dc[d];
					if(endR == nr && endC == nc) {
						cnt = 1;
						break;
					}
					if(!check(nr,nc)) {
						continue;
					}
					if(map[nr][nc] == 0 && visit[nr][nc] ==0) {
						que.offer(new Point(nr,nc));
						visit[nr][nc] = 1;
					}
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
	}

}
