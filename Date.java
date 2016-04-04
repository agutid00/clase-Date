class Date{
	int year;
	int month;
	int day;

	Public Date (int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		}
		boolean isSameYear (Date otherDate){
			return this.year==otherDate.getYear();
			}
		int getDay (){
			return this.day;
			}
		void set Day (int day){
			this.day=day;
			}
		boolean is Same (Date another){
			return (isSameYear(another)&&isSameMonth(another)&&isSameDay(another));
			}
	
		String getMonthName(){
		String month=newString("");
	switch (month){
		
		case 1:
			   if(day>=1&&day<=31){
			   	
				month="Enero";
				break;
				}
		case 2:
			   if(day>=1&&day<=28){
				month="Febrero";
				break;
				}
		case 3:
			   if(day>=1&&day<=31){
				month="Marzo";
				break;
				}
		case 4:
			   if(day>=1&&day<=30){
				month="Abril";
				break;
				}
		case 5:
			   if(day>=1&&day<=31){
				month="Mayo";
				break;
				}
		case 6:
			   if(day>=1&&day<=30){
				month="Junio";
				break;
				}
		case 7:
			   if(day>=1&&day<=31){
				month="Julio";
				break;
				}
		case 8:
			   if(day>=1&&day<=31){
				month="Agosto";
				break;
				}
		case 9:
			   if(day>=1&&day<=30){
				month="Septiembre";
				break;
				}
		case 10:
			   if(day>=1&&day<=31){
				month="Octubre";
				break;
				}
		case 11:
			   if(day>=1&&day<=30){
				month="Noviembre";
				break;
				}
		case 12:
			   if(day>=1&&day<=31){
				month="Diciembre";
				break;
				}
		}
	}
	public int
}