package org.swtk.commons.dict.wiktionary.generated.a.b.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryABV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("abvolt", "{\"term\":\"abvolt\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|ab|volt|t1\u003dabsolute|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A unit of electrical potential equal to one hundred millionth of a volt (10\u0026lt;sup\u0026gt;-8\u0026lt;/sup\u0026gt; volts), used in the centimeter-gram-second system of units\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }