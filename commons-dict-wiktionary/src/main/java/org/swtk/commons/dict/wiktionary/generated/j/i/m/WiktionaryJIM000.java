package org.swtk.commons.dict.wiktionary.generated.j.i.m;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJIM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jimboite", "{\"term\":\"jimboite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Jimbo|ite|lang\u003den}}, after Kotora Jimbo (1867-1924).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orthorhombic-dipyramidal mineral containing boron, manganese, and oxygen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jimmy", "{\"term\":\"jimmy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Jim|y|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"or Jim, also used as a formal given name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1979\u0027\u0027 w:Charles Charles Kuralt, Dateline America, Harcourt Brace Jovanocich, ISBN 0151239576, page 184\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Heaven only knows why a man with a strong biblical name like James wants to be a president named \u0027\u0027Jimmy\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Shortened form of , a piddle\", \"priority\":4}]}, \"synonyms\":{}}");

	add("jimmy", "{\"term\":\"jimmy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Chocolate sprinkles used as a topping for ice cream, cookies, or cupcakes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A marijuana cigarette\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A device used to circumvent a locking mechanism; a slim-Jim\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Royal Navy slang for First Lieutenant (Executive Officer\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A jemmy; a crowbar used by burglars to open windows and doors\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A penis\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A condom\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, w:Murad Murad Kalam, \u0027Night Journey\u0027, Simon \u0026amp; Schuster (2004), ISBN 0743244184, [http://books.google.com/books?id\u003d6WzillxAIssC\u0026amp;pg\u003dPA158 page 158\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"quot;The next time you hook up with somebody,\u0026quot; Lovie was saying, \u0026quot;you better wear a \u0027\u0027jimmy\u0027\u0027, boy\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A male crab; a cock\", \"priority\":10}]}, \"synonyms\":{}}");

	add("jimping", "{\"term\":\"jimping\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A series of notches down the spine of a blade created to provide grip on a knife beyond the bolster\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }