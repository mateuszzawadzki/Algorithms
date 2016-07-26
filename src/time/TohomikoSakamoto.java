package time;

public class TohomikoSakamoto {
	public static String printDayOfTheWeek(int year, int month, int day){
		int calculatedDay = dayOfTheWeek(year, month, day);
		switch(calculatedDay){
			case 0:
				return("Sunday");
			case 1:
				return("Monday");
			case 2:
				return("Tuesday");
			case 3:
				return("Wednesday");
			case 4:
				return("Thursday");
			case 5:
				return("Friday");
			case 6:
				return("Saturday");
			default:
				return("???");
		}
	}
	public static int dayOfTheWeek(int year, int month, int day){
		int[] add={0,3,2,5,0,3,5,1,4,6,2,4};
		if(month<3)
			year--;
		return (year + year/4 - year/100 + year/400 + add[month-1] + day) % 7;
	}
	public static void main(String[] args){
		System.out.println(printDayOfTheWeek(2017,4,1));
	}
}
