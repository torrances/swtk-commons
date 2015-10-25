package org.swtk.commons.dict.wiktionary.generated.y.e.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYER000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yerevan", "{\"term\":\"yerevan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|hy|Երեւան|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the capital and largest city of Armeni\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027, \u0027The Great Game\u0027, Folio Society 2010, p. 99\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Before long Abbas Mirza suffered a succession of defeats, which culminated in the capture of \u0027\u0027Erivan\u0027\u0027, today capital of Armenia\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Geoff Garvey, \u0027The Guardian\u0027, 26 Sep 2009\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Crammed to the gills with history, it nestles in the shadow of Mount Ararat and has a medieval centre but it\u0027s \u0027\u0027Yerevan\u0027\u0027s religious heritage that is its main claim to fame\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }