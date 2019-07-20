package android.lifeistech.com.flashcardplus;

public class Card {
    public int imageId;
    public String title;
    public String content;
    public int likeNum;

    public String meaning;

    public Card(int imageId,String title,String content,int likeNum,String meaning){
        this.imageId=imageId;
        this.title=title;
        this.content=content;
        this.likeNum=likeNum;
        this.meaning=meaning;
    }

}
