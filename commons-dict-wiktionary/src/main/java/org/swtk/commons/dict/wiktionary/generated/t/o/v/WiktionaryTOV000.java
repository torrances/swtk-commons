package org.swtk.commons.dict.wiktionary.generated.t.o.v;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTOV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tovarish", "{\"term\":\"tovarish\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian {{m|ru|това́рищ}}, from\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Comrade, especially with reference to the former USSR\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1919\u0027\u0027, \u0027w:The The Times\u0027, 6 Dec 1919, p.10 col. C\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Instead of addressing them according to revolutionary etiquette as \u0027\u0027Tovarish\u0027\u0027 (comrade), he asked them their Christian names and that of their fathers, while telling them his own\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1938\u0027\u0027, Margaret Sanger, \u0027Margaret Sanger: An Autobiography\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Touching one of them on the shoulder, she said, “\u0027\u0027Tovarish\u0027\u0027, these \u0027\u0027tovarishes\u0027\u0027 want to know who you are.”\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1940\u0027\u0027, w:Jan Jan Valtin, \u0027Out of the Night\u0027, 2005, Kessinger Publishing Company, [http://books.google.com/books?id\u003dVN88aBetprgC\u0026amp;pg\u003dPA436\u0026amp;dq\u003d%22tovarish%22\u0026amp;hl\u003den\u0026amp;ei\u003dfH8lTtuqBfHimAWP0NiCCg\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d7\u0026amp;ved\u003d0CD8Q6AEwBjg\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22tovarish%22\u0026amp;f\u003dfalse page 436\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Jensen laughed, “My wife complains: ‘All day long they ring our door bell. \u0027\u0027Tovarish\u0027\u0027 here, \u0027\u0027tovarish\u0027\u0027 there. They come from Moscow, from Leningrad, from Berlin and Hamburg. They don\u0027t speak one word of Danish. Comrade Jensen, they say, fix us up with Danish passports.’ So it goes\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"1988\u0027\u0027, w:Anthony Anthony Burgess, \u0027w:Any Old Any Old Iron\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"His Russian was derived from a fortnight’s crash course. ‘You’d better see what this, ah, \u0027\u0027tovarish\u0027\u0027 thinks he wants\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, Livia Bitton-Jackson, \u0027I Have Lived A Thousand Years: Growing Up In The Holocaust\u0027 (ISBN 0689823959\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027tovarishes\u0027\u0027 bring along their harmonicas and balalaikas, their good voices and their good humor\", \"priority\":12}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }