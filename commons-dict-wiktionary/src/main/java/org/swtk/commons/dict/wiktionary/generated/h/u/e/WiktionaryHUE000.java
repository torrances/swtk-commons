package org.swtk.commons.dict.wiktionary.generated.h.u.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("huemul", "{\"term\":\"huemul\", \"etymology\":{\"influencers\":[], \"languages\":[\"mapudungun\", \"English\", \"Spanish\"], \"text\":\"From Spanish {{m|es|huemul}}, from Mapudungun\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A yellowish-brown deer of the genus , of South America; the two species are endangered\", \"priority\":1}]}, \"synonyms\":{}}");

	add("huemulite", "{\"term\":\"huemulite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A triclinic-pinacoidal mineral containing hydrogen, magnesium, oxygen, sodium, and vanadium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }