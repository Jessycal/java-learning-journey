public enum EnumDemonstration{

	//declare constants of enum types
	JHTP("Java How to Program", "2018"),                       
   CHTP("C How to Program", "2016"),                          
   IW3HTP("Internet & World Wide Web How to Program", "2012"),
   CPPHTP("C++ How to Program", "2017"),                      
   VBHTP("Visual Basic How to Program", "2014"),              
   CSHARPHTP("Visual C# How to Program", "2017");             

  //instance fields
   private final String bookTitle;
   private final String copyRightYear;

   //constructors
   EnumDemonstration(String bookTitle, String copyRightYear) {
   	this.bookTitle = bookTitle;
   	this.copyRightYear = copyRightYear;
   }

   //accessor to get fields (get methods)
   public String getbookTitle() {
   	return bookTitle;
   }

   public String getcopyRightYear() {
   	return copyRightYear;
   }
}

 