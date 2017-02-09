/*(1) public final int suitNumber
카드의 모양을 뜻합니다. 카드 모양에는 정수 1, 2, 3, 4로 표현되는 '클로버(Clubs)', '하트(Hearts)', '다이아몬드(Diamonds', '스페이드(Spades)'가 있습니다.
한 번 정해지면 바뀔 이유가 없기 때문에 final입니다. 또한 특별히 getter가 필요 없기 때문에 public 입니다.
(2) public final int rankNumber
카드의 값을 뜻합니다. 1, 11, 12, 13은 각각 'Ace', 'Jack', 'Queen', 'King'로 표현되고, 2~10은 그 숫자 자체로 표현됩니다.
마찬가지로 한 번 정해지면 바뀔 이유가 없기 때문에 public final입니다.
(3) public Card(int suitNumber, int rankNumber)
파라미터로 정수형 suit와 rank를 받고, 인스턴스 변수 suit와 rank에 각각 지정해줍니다. 1 <= suit <= 4, 1 <= rank <= 13라고 가정합시다!
(4) public String getSuit()
변수 suit의 숫자 값에 해당하는 슈트(suit)를 리턴해줍니다.*/

package hellojava;
import java.io.*;
import java.util.*;

public class Card {
	   public final int suitNumber;
	    public final int rankNumber;
	    
	    public String clover = "Clubs";
	    public String hearts = "Hearts";
	    public String dia = "Diamonds";
	    public String spades = "Spades";
	    
	    public Card(int suitNumber, int rankNumber) {
	    	this.suitNumber = suitNumber;
	    	this.rankNumber = rankNumber;
	    }
	    public String getSuit() {
	    	switch(suitNumber){
	    	
	    	case 1:
	    		return clover;
	    		
	    	case 2: 
	    		return hearts;
	    	case 3:
	    		return dia;
	    	case 4:
	    		return spades;	    	
	    		}
	    	return "cardError";	
	    }

	    public String getRank() {
	    	if (2 <= rankNumber && rankNumber <= 10) 
	    		return String.valueOf(rankNumber);
	    	else{
	    		switch(rankNumber){
	    		case 1: 
	    			return "Ace";
	    		case 11:
	    			return "Jack";
	    		case 12:
	    			return "Queen";
	    		case 13:
	    			return "King";
	    		}
	    	}
	    	return "SystemError";
	    }
	    
	    public String toString() {
	    	return (this.getRank() + " of " + this.getSuit());
	    }

	}

