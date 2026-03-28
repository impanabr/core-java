class Page{
static String pageNames[]={"TittlePage","IndexPage","ChapterPage","ExercisePage","LastPage","NotesPage","ContentPage","PicturePage"};
static int pageNumbers[]={1,2,3,4,5,6,7,8};
static float pageRating[]={4.5f,5.5f,4.0f,4.3f,4.8f,4.2f,4.0f,5.0f};
public static void getPageDetails(){
		
		for(int index=0;index<pageNames.length;index++){
			System.out.println("Page Name:"+pageNames[index]);
			System.out.println("Page Numbers:"+pageNumbers[index]);
			System.out.println("Page Rating:"+pageRating[index]);
			System.out.println();
	}
}
}