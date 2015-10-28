package org.swtk.commons.dict.wordnet.indexbyname.instance.l.u.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13662195\"]}");
	add("{\"term\":\"luxation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07459610\"]}");
	add("{\"term\":\"luxembourg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08980760\", \"08981175\"]}");
	add("{\"term\":\"luxembourger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09740640\"]}");
	add("{\"term\":\"luxemburg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08980760\", \"08981175\"]}");
	add("{\"term\":\"luxemburger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09740640\"]}");
	add("{\"term\":\"luxor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08919804\"]}");
	add("{\"term\":\"luxuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00760688\"]}");
	add("{\"term\":\"luxuriance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05123543\"]}");
	add("{\"term\":\"luxuriation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01073845\"]}");
	add("{\"term\":\"luxuriousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14515957\"]}");
	add("{\"term\":\"luxury\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14515957\", \"05153718\", \"05126523\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }