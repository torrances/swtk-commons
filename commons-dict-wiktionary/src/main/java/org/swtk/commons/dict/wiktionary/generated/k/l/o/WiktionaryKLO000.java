package org.swtk.commons.dict.wiktionary.generated.k.l.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKLO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("klondike", "{\"term\":\"klondike\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From w:Klondike, Yukon|Klondike, a region in the Yukon territory of Canada that saw a gold rush.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A source of wealth or something else valuable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("klonvocation", "{\"term\":\"klonvocation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Klan|convocation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A meeting of the Ku Klux Klan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, Alexander Leidholdt, \u0027Editor for justice: the life of Louis I. Jaffé\u0027 (page 169\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"But other \u0027\u0027klonvocations\u0027\u0027, held contemporaneously with Norfolk\u0027s, he pointed out, had displayed a more malevolent quality\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }