package org.swtk.commons.dict.wiktionary.generated.k.e.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKEL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kelp", "{\"term\":\"kelp\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"14th c., from Middle english (1100-1500) \u0027culpe\u0027 but of uncertain ultimate origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several large brown seaweeds (order Laminariales\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The calcined ashes of seaweed, formerly used in glass and iodine manufacture\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kelpfish", "{\"term\":\"kelpfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|kelp|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A perciform fish in the family , native to coastal Australia and New Zealand\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kelsey", "{\"term\":\"kelsey\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|cēol||ship}} + \u0027sige\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname, popular in the 1990s\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A hamlet in Alberta, Canada\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in California\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in Texas\", \"priority\":4}]}, \"synonyms\":{}}");

	add("kelvin", "{\"term\":\"kelvin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A river in Scotland, running through Glasgow\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname; rather rare\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }