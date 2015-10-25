package org.swtk.commons.dict.wiktionary.generated.a.h.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAHI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ahimsa", "{\"term\":\"ahimsa\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027अहिंसा\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A doctrine of non-violence in Hinduism and Buddhism, concerned with the sacredness of all living things and an effort to avoid causing harm to them\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Karen Armstrong, \u0027The Great Transformation\u0027, Atlantic Books 2007, p. 79\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Already, at this very early date, the ritualists were moving towards the ideal of \u0027\u0027\u0027ahimsa\u0027\u0027\u0027 (\u0026quot;harmlessness\u0026quot;) that would become the indispensable virtue of the Indian Axial Age\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }