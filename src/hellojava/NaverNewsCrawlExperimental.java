package hellojava;
import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;


public class NaverNewsCrawlExperimental {
	public static void main (String args[]) throws Exception{
		
		String articleURL = "http://news.naver.com/main/hotissue/read.nhn?mid=hot&sid1=100&cid=1060622&iid=34332755&oid=001&aid=0009191524&ptype=052";
		Document doc = Jsoup.connect(articleURL).get();
		Elements articleBody = doc.select("div#articleBodyContents");
		Elements timestamp = doc.select("span.t11");
		String result = articleBody.text();
		String time = timestamp.text();
		System.out.println(time);
		System.out.println(result);
	}
	
	
	
	

}
