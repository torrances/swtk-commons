package org.swtk.commons.dict.wiktionary.generated.a.i.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aide", "{\"term\":\"aide\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027aider|lang\u003dfr\u0027 () from Latin {{m|la|adiuvō||I help}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An assistant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An officer who acts as assistant to a more senior one; an aide-de-camp\", \"priority\":2}]}, \"synonyms\":{}}");

	add("aids", "{\"term\":\"aids\", \"etymology\":{\"influencers\":[], \"languages\":[\"Czech\", \"English\"], \"text\":\"From English \u0027aids\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"acquired immune deficiency syndrom\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Acquired immune deficiency syndrome\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, \u0027Clinical Pathology\u0027 (ISBN 0198569467), page 50\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Patients with \u0027\u0027AIDS\u0027\u0027 become highly susceptible to infection by intracellular microbes normally contained by T cells (Fig. 4.8\", \"priority\":4}]}, \"synonyms\":{}}");

	add("aids", "{\"term\":\"aids\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"acquired immune deficiency syndrome\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aidan", "{\"term\":\"aidan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Irish\", \"Scottish Gaelic\"], \"text\":\"Anglicized form of the Irish saints\u0027 name {{m|ga|Aodhán}}, and of the Scottish gaelic {{m|gd|Aodhàn}}, diminutives of {{m|ga|Aodh}} (literally \u0026quot;fire\u0026quot;, the name of a Celtic sun god).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of modern usage\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aider", "{\"term\":\"aider\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|aid|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One that assists\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aidman", "{\"term\":\"aidman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|aid|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An army medical corpsman attached to a field unit\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }