package final_algo.data_structure;

public class QuickSort {
	
	/**
	 * 시작 위치와 끝나는 위치를 받아서 재귀함수 호출
	 * @param arr
	 */
	private static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length -1);
	}
	
	/**
	 * 재귀함수
	 * @param arr 배열의 포인터
	 * @param start 시작점 (범위)
	 * @param end 끝나는 지점 (범위)
	 */
	private static void quickSort(int[] arr, int start, int end) {
		/*시작과 끝 점 기준으로 partition을 나누고
		 * partition의 오른쪽 방 첫번째 값을 part2에 대입한다.
		 * */
		int part2 = partition(arr, start, end);
		
		//왼쪽 partition 정렬 조건
		if(start < part2 -1) {
			//왼쪽 partition, 시작점, 끝나는 점은 part2의 -1 값 
			quickSort(arr,start, part2-1);
		}
		//오른쪽 partition 정렬 조건
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	/**
	 * 배열 arr의 partition을 나누는 것을 정의하는 메서드
	 * @param arr 배열의 포인터
	 * @param start partition의 시작점
	 * @param end partition의 끝나는 지점
	 * @return
	 */
	private static int partition(int[] arr, int start, int end) {
		//여기서의 pivot은 배열의 중간 값으로 한다.
		int pivot = arr[(start + end)/2];
		while(start<=end) {
			//배열 값이 pivot값보다 크거나 같을 경우까지 start index값을 증가시켜 준다.
			while(arr[start] < pivot) start ++;
			//위의 경우가 만족하면 end point를 옮겨주어 pivot값을 기준으로 start값과 swap시킬 end값을 찾는다.
			while(arr[end] > pivot) end--;
			
			//시작점과 끝점이 지나치진 않았는지 다시한번 확인.
			if(start<=end) {
				swap(arr,start,end);
				
				//원래방향으로 하나씩 증가를 시켜준다.
				start++;
				end--;
			}
		}
		//그렇게 되면 결국 start 와 end가 같아질때 start를 반환한다.
		return start;
	}
	private static void swap(int [] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	 
	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}

}
