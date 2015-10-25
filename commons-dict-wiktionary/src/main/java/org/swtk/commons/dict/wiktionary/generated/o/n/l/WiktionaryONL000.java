package org.swtk.commons.dict.wiktionary.generated.o.n.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryONL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("onliner", "{\"term\":\"onliner\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|online|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who is online; a user of the Internet or similar service\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onlyborn", "{\"term\":\"onlyborn\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|only|born|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The only child to be born to a parent or family\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, Susan Newman, \u0027Parenting an Only Child: The Joys and Challenges of Raising Your One and Only\u0027, Broadway Books (2001), ISBN 9780767906296, [http://books.google.com/books?id\u003diwFto2-RVSgC\u0026amp;pg\u003dPA49 page 49\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One of the most extensive studies ever undertaken tracked more than three thousand high school students — half were \u0027\u0027onlyborns\u0027\u0027, half had one sibling — for a twenty-year period\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }