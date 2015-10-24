package org.swtk.commons.dict.wiktionary.generated.n.i.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nilgai", "{\"term\":\"nilgai\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A large antelope, of the genus \u0027Boselaphus\u0027, from northern India; the blue bull\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nilghai", "{\"term\":\"nilghai\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A short-horned Indian antelope\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1895\u0027\u0027 — w:Rudyard Rudyard Kipling, \u0027The Second Jungle Book\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"when the Pack drives the \u0027\u0027nilghai\u0027\u0027, the big blue cow, before them, and it seemed to come from the very ends of the earth, nearer, and nearer, and nearer, till it ended in a shriek snapped off short\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }