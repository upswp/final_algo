package final_algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*Gold 3*/
public class BOJ_1377_버블소트 {

	static class A implements Comparable<A> {
		int i;
		int v;

		public A(int i, int v) {
			super();
			this.i = i;
			this.v = v;
		}

		@Override
		public int compareTo(A o) {
			if(this.v - o.v == 0) return this.i - o.i;
			return this.v - o.v;
		}

	}

	static int N, max;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		N = Integer.parseInt(br.readLine());
		PriorityQueue<A> pq = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			pq.add(new A(i, Integer.parseInt(br.readLine())));
		}

		int count = 0;
		while(!pq.isEmpty()) {
			A a = pq.poll();
			if(max < a.i -count) max = a.i-count;
			count++;
		}
		sb.append(max+1);
		System.out.println(sb.toString());
	}
}
