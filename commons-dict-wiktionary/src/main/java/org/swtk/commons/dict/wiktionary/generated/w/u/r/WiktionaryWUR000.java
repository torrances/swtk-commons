package org.swtk.commons.dict.wiktionary.generated.w.u.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWUR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wurst", "{\"term\":\"wurst\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"old english (ca. 450-1100)\", \"German\", \"English\", \"middle high german (ca. 1050-1500)\", \"old high german (ca. 750-1050)\", \"old saxon\"], \"text\":\"1890, from German \u0027wurst\u0027 (sausage, wurst) from Middle high german (ca. 1050-1500) \u0027wurst\u0027 from Old high german (ca. 750-1050) \u0027wurst\u0027 from Proto-germanic {{m|gem-pro|*wurstiz||something turned or twisted}}, from Proto-indo-european {{m|ine-pro|*wert-}}, {{m|ine-pro|*-d-||to turn}}. Akin to Old saxon \u0027worst\u0027 (wurst) Old english (ca. 450-1100) \u0027weorþan\u0027 (to turn, become) Unrelated to \u0027worsted\u0027 (type of yarn) More at {{m|en|worth||to be, become, betide}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A German- or Austrian-style sausage\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Dardis McNamee, \u0027Frommer\u0027s Austria\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In summer, you\u0027re welcomed into a flower-decked garden set against a backdrop of ancient vineyards. You can fill up your platter with some of the best \u0027\u0027wursts\u0027\u0027 and roast meats (especially the delectable pork), along with freshly made salads.Category:en:Sausages\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }