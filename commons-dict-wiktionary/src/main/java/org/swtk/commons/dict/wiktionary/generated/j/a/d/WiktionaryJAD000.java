package org.swtk.commons.dict.wiktionary.generated.j.a.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJAD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jadarite", "{\"term\":\"jadarite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mineral, sodium lithium boron silicate hydroxide\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jadeite", "{\"term\":\"jadeite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jade|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pyroxene mineral, a sodium aluminium silicate with the chemical formula Na(aluminum|Al,iron|Fe\u0026lt;sup\u0026gt;3+\u0026lt;/sup\u0026gt;)silicon|Si\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;oxygen|O\u0026lt;sub\u0026gt;6\u0026lt;/sub\u0026gt;, found in metamorphic rocks\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }