package org.swtk.commons.dict.wiktionary.generated.v.i.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("viking", "{\"term\":\"viking\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"old norse\", \"old frisian\"], \"text\":\"A loan from Old norse \u0027víkingr\u0027 Already in Old english (ca. 450-1100) as {{m|ang|wīcing}} and Old frisian \u0027witsing\u0027 \u0027wising\u0027 but extinct in Middle English and loaned anew in the 19th century.Old norse \u0027víking\u0027 () itself is from Old norse \u0027vík\u0027 (inlet”, “cove”, “fjord) + \u0027-ing\u0027 (one belonging to”, “one who frequents) (the \u0027-r\u0027 is the nominative desinence).Thus, “one from or who frequents the sea’s inlets”,The Old English or Anglo-Frisian form, existing therein since at least the eighth century), could also have been derived from or influenced by Old english (ca. 450-1100) {{m|ang|wīc||camp}}, on account of the temporary encampments which were often a prominent feature of the Vikings’ raids.\u0026lt;ref name\u003d\u0026quot;OED\u0026quot;/\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the Scandinavian seafaring warriors that raided (and then settled) the British Isles and other parts of Europe in the 8\u0026lt;sup\u0026gt;th\u0026lt;/sup\u0026gt; to the 11\u0026lt;sup\u0026gt;th\u0026lt;/sup\u0026gt; centuries and, according to many historians, were the first Europeans to reach North America\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A stock character common in the fantasy genera, namely a barbarian, generally equipped with an ax or sword and a helmet adorned with horns\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A player on the w:Minnesota Minnesota Vikings NFL team\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }