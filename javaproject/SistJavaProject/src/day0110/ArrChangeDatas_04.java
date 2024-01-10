package day0110;

public class ArrChangeDatas_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,7,10,15,24,12,99,76,88,11};
		
		System.out.println("**원데이터**");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		System.out.println("**거꾸로 변경하기**");
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i]; //10개일때 0하고 9번 바꾸는 것
			arr[arr.length-1-i]=temp;
		}
		//출력
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		System.out.println("**오름차순 정렬**");
		//가장 작은 숫자 얖으로 보내기(선택정렬)
		//Arrays.sort(arr); 배열 arr을 정렬한다
		
		//기준 데이터는 0부터 끝에서 두번째 까지
		for(int i=0;i<arr.length-1;i++)
		{
			//비교하는 데이타는 기준 다음값부터 끝까지
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) //기준값이 커야함
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

}
