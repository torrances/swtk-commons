package org.swtk.commons.dict.wiktionary.generated.n.a.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNAG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nagana", "{\"term\":\"nagana\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Probably from a South African native name.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A disease of vertebrates caused by trypanosomes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nagger", "{\"term\":\"nagger\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"one who nags\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nagware", "{\"term\":\"nagware\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|nag|ware|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Software that displays a message requesting that the user register\u0026lt;!--sic--\u0026gt; it\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nagykanizsa", "{\"term\":\"nagykanizsa\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A town in Hungary, Zala county\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }