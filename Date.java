public class Date{
	private int year;
	private int month;
	private int day;

	public Date (int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		}
	boolean isSameYear (Date otherDate){
			return this.year==otherDate.getyear();
			}
	boolean isSameMonth (Date otherDate){
			return this.month==otherDate.getmonth();
			}
	boolean isSameDay (Date otherDate){
			return this.day==otherDate.getday();
			}
	int getyear (){
			return this.year;
			}
	int getmonth (){
			return this.month;
			}
	int getday (){
			return this.day;
			}
	void setDay (int day){
			this.day=day;
			}
	boolean isSame (Date another){
			return ((isSameYear(another))&&(isSameMonth(another))&&(isSameDay(another)));
			}
	
	String getMonthName(){
		String month=new String("");
	switch (this.month){
		
		case 1:
			   	
				month="Enero";
				break;
				
		case 2:
			    
				month="Febrero";
				break;
				
		case 3:
			   
				month="Marzo";
				break;
				
		case 4:
			   
				month="Abril";
				break;
				
		case 5:
			   
				month="Mayo";
				break;
				
		case 6:
			   
				month="Junio";
				break;
				
		case 7:
			   
				month="Julio";
				break;
				
		case 8:
			 
				month="Agosto";
				break;
				
		case 9:
			   
				month="Septiembre";
				break;
				
		case 10:
			   
				month="Octubre";
				break;
				
		case 11:
			   
				month="Noviembre";
				break;
				
		case 12:
			  
				month="Diciembre";
				break;
				
		}
		return (month);
	} 
}