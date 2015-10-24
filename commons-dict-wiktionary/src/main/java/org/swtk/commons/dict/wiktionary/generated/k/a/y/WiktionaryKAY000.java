package org.swtk.commons.dict.wiktionary.generated.k.a.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kayak", "{\"term\":\"kayak\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Inuktitut\"], \"text\":\"From Inuktitut (Western Canadian Inuktitut) {{m|iu|ᖃᔭᖅ||man\u0027s boat|sc\u003dCans}}, from Proto-eskimo {{m|esx-esk-pro|*qyaq}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of small boat, powered by the occupant or occupants using a double-bladed paddle in a sitting position\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }