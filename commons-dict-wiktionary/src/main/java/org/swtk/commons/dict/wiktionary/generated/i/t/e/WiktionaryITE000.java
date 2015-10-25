package org.swtk.commons.dict.wiktionary.generated.i.t.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryITE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("itemizer", "{\"term\":\"itemizer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|itemize|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"That which itemizes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, B. T. Sue Atkins, ‎Michael Rundell, \u0027The Oxford Guide to Practical Lexicography\u0027 (page 323\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the functions it performs in the language, as for instance an \u0027\u0027itemizer\u0027\u0027 of mass nouns or a collective of plural nouns, a support verb, etc\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"One who makes itemized deductions on a tax return\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }