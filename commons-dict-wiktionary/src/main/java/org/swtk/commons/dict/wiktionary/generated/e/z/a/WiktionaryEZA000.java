package org.swtk.commons.dict.wiktionary.generated.e.z.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEZA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ezafe", "{\"term\":\"ezafe\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Persian\"], \"text\":\"From Persian {{m|fa|اضافه|tr\u003dezâfe}}, from Arabic {{m|ar|إِضَافَة|gloss\u003daddition, adjunct}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A grammatical particle found in some Iranian and Iranian-influenced languages which links two words together; it consists of the unstressed vowel \u0027-e\u0027 / \u0027-ye\u0027 (Persian, Urdu), \u0027-i\u0027 / \u0027-yi\u0027 (Classical Persian, Kurdish, Urdu, Ottoman Turkish), or \u0027-ı\u0027 (Ottoman Turkish) between the words it connects, and often approximately corresponds in usage to the English preposition \u0026quot;of\u0026quot;, similar but not to be confused with Arabic ʾiḍāfa\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }