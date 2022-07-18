package br.com.requestServico;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import br.com.requestServico.model.Produto;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws Exception
    {
    	  try {
              Connection conn = Jsoup.connect("https://lista.mercadolivre.com.br/iphone");
              Document document = conn.get();
              //document.cssSelector().
             
              Elements element = document.getElementsByClass("ui-search-item__title");
              Elements elementValor = document.getElementsByClass("price-tag-fraction");
              
              System.out.println(elementValor.select("span").first());
              System.out.println(element.select("h2").first());

          } catch (IOException e) {
              e.printStackTrace();
          }
    }
    
    /*String baseUrl = "https://lista.mercadolivre.com.br/iphone";
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try{
			HtmlPage page = client.getPage(baseUrl);
			List<HtmlElement> itemNome =  page.getByXPath("//h2[@class='ui-search-item__title']");
			List<HtmlElement> itemValor =  page.getByXPath("//span[@class='price-tag ui-search-price__part']");
			if(itemNome.isEmpty()){
				System.out.println("No item found");
			}else{
				for(HtmlElement htmlItem : itemNome){
					if(htmlItem == itemNome) {
						itemNome.forEach(c -> c.getFirstByXPath(""));
						System.out.println(itemNome);
					}
				}
				for(HtmlElement htmlItem:itemValor) {
					if(htmlItem == itemValor) {
						itemValor.forEach(c -> c.getFirstByXPath(""));
						System.out.println(itemValor);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			client.close();
		}
	}*/
    
  
}
