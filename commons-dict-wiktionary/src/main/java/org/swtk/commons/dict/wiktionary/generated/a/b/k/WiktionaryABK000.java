package org.swtk.commons.dict.wiktionary.generated.a.b.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryABK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("abkari", "{\"term\":\"abkari\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\"], \"text\":\"From Persian \u0027آبکاری\u0027 from \u0027آبکار\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The manufacture or sale of liquors or drugs\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A revenue tax on the manufacture or sale of liquors and drugs.\u0026lt;ref\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

	add("abkhasian", "{\"term\":\"abkhasian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }