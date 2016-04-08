package es.unileon.prg1.Date;
public class Date{
	private int year;
	private int month;
	private int day;

	public Date (int day,int month,int year) throws DateException {
		StringBuffer message= new StringBuffer();
		
		if(day<=0){
			message.append("no se admiten valores negativos para los dias - error dato:" + day + "\n");
		}
		if(month<=0){
			message.append("no se admiten valores negativos para los meses - error dato:" + month + "\n");
		}
		if(month<12){
			message.append("no se admiten valores superiores a 12 para los meses - error dato:" + month + "\n");
		}
		if (monthRight(day,month)==-1){
			message.append("no se admiten ese dia para determinado mes  - error dato:" + month + "\n" + month + "\n");
		}
		if(message.length()!=0){
			throw new DateException(message);	
		}
		else{
		
		this.month=month;
		this.year=year;
		this.day=day;
		}
	}
	public boolean isSameYear (Date otherDate){
			return this.year==otherDate.getyear();
			}
	public boolean isSameMonth (Date otherDate){
			return this.month==otherDate.getmonth();
			}
	public boolean isSameDay (Date otherDate){
			return this.day==otherDate.getday();
			}
	public int getyear (){
			return this.year;
			}
	public int getmonth (){
			return this.month;
			}
	public int getday (){
			return this.day;
			}
	public void setDay (int day){
			this.day=day;
			}
	public void setYear (int year){
			this.year=year;
			}
	public void setMonth (int month){
			this.month=month;
			}
	public boolean isSame (Date another){
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
	private int MonthRight (int day,int month){
			
		
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
						if (day<=31 || day <=1){
						}
							break;
						
					
				case 2:
						if (day<=28 || day <=1){
						}
							break;
					
				case 4:
				case 6:
				case 9:
				case 11:
						if (day<=30 || day <=1){
						}
							break;
			}
	}
}
