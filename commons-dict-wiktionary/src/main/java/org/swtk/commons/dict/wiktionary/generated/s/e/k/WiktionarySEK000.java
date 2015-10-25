package org.swtk.commons.dict.wiktionary.generated.s.e.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySEK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sekanjabin", "{\"term\":\"sekanjabin\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Persian\"], \"text\":\"From Persian \u0027سکنجبین|tr\u003dsekanjabin\u0027 (honeyed vinegar) from Arabic \u0027سِكَنْجَبِين\u0027 from Persian \u0027سکنگبین\u0027 from earlier \u0027سرکنگبین\u0027 from \u0027سرکه|tr\u003dserke\u0027 (vinegar) and \u0027انگبین|tr\u003dangobin\u0027 (honey)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A syrup (or the drink made by diluting it) producing by boiling water, dissolving sugar in it, and adding vinegar; the drink is often spiced with mint\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sekere", "{\"term\":\"sekere\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Yoruba\"], \"text\":\"From Yoruba {{etystub|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A musical instrument consisting of a gourd surrounded by a net of beads\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027sekere\u0027\u0027 may be twisted, shaken or slapped to produce a subtle variety of effects\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }