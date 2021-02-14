package final_algo.data_structure;

public class MergeSort {
	private static void mergeSort(int[] arr) {
		// 배열의 크기만큼 임시 저장소를 생성
		int tmp[] = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length - 1);
	}

	/**
	 * 재귀 함수
	 * @param arr 정렬할 배열
	 * @param tmp 임시 저장소
	 * @param start 시작 index
	 * @param end 끝 index
	 */
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) {
			//중간점
			int mid = (start + end) / 2;
			//배열의 앞부분으로 start ~ mid
			mergeSort(arr, tmp, start, mid);
			//배열의 뒷부분으로 mid ~ end
			mergeSort(arr,tmp,mid + 1, end);
			//왼쪽 정렬과 오른쪽 정렬을 합치는 merge
			merge(arr, tmp, start, mid, end);
		}
	}
	/**
	 * 정렬된 배열들을 합쳐주는 함수
	 * @param arr 배열
	 * @param tmp 배열 임시공간
	 * @param start 시작점
	 * @param mid 중간점 
	 * @param end 끝점
	 */
	private static void merge (int [] arr, int [] tmp, int start, int mid, int end) {
		for(int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		//왼쪽 정렬 배열의 첫 점
		int part1 = start;
		//오른쪽 정렬 배열의 첫 점
		int part2 = mid + 1;
		//결과 배열의 index, 두개의 배열 중 작은 값을 넣는 index 자리값을 나타내는 값, 이후 하나씩 늘려주며 다음에 저장할 공간을 기억하게 함.
		int index = start;
		//전체 범위를 탐색
		while(part1 <= mid && part2 <= end) {
			//만약 앞의 앞의 비교값이 더 작으면
			if(tmp[part1] <= tmp[part2]) {
				//arr에 index 위치에 part1을 넣는다.
				arr[index] = tmp[part1];
				//그리고 넣은 part1의 index를 1올려준다.
				part1++;
			}else {
				arr[index] =tmp [part2];
				part2++;
			}
			//arr[index]값을 1올려준다.
			index++;
		}
		//위 경우는 왼쪽 배열이나 오른쪽 배열 두 배열중 하나가 빌때 까지 적용된다.
		//그랬을 경우 만약 왼쪽 배열의 남아있는 값들을 arr[index + 1]해서 붙여준다.
		//오른쪽 배열이 남을 경우는 이미 arr[index]뒤쪽으로 자리하고 있기 때문에 따로 정의해줄 필요가 없다.
		for (int i = 0; i <= mid-part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
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
		mergeSort(arr);
		printArray(arr);
	}
}
