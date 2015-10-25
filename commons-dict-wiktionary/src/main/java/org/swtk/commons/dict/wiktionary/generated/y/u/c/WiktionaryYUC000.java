package org.swtk.commons.dict.wiktionary.generated.y.u.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYUC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yucca", "{\"term\":\"yucca\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"galibi carib\", \"English\"], \"text\":\"Variant of \u0027yuca\u0027, from Galibi carib \u0027yuca\u0027 (cassava) because {{w|Carl Linnaeus}} and others confused it with that plant.\u0026lt;ref\u0026gt;{{cite-book|url\u003dhttp://books.google.com/books?id\u003dYbVYuq73I0wC\u0026amp; |author\u003dGary Irish |title\u003dAgaves, Yuccas, and Related Plants: a Gardener\u0027s Guide |year\u003d2000 |publisher\u003dTimber Press |isbn\u003d978-0-88192-442-8 |page\u003d18|text\u003d}}\u0026lt;/ref\u0026gt;\u0026lt;ref\u0026gt;{{cite-book|url\u003dhttp://books.google.com/books?id\u003d2ndDtX-RjYkC\u0026amp; |title\u003dCRC World Dictionary of Plant Names |volume\u003d4 R-Z |year\u003d2000 |author\u003dUmberto Quattrocchi |publisher\u003dTaylor \u0026amp; Francis US |isbn\u003d978-0-8493-2678-3 |page\u003d2862|text\u003d}}\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several evergreen plants, of the genus \u0027Yucca\u0027, having long, pointed, and rigid leaves at the top of a woody stem, and bearing a large panicle of showy white blossoms\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }