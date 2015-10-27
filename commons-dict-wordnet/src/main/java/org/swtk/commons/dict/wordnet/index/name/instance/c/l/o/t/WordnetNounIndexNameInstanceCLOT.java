package org.swtk.commons.dict.wordnet.index.name.instance.c.l.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05409434\"]}");
	add("{\"term\":\"clotbur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11944914\"]}");
	add("{\"term\":\"cloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314753\"]}");
	add("{\"term\":\"clothes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02731365\"]}");
	add("{\"term\":\"clothesbrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03054438\"]}");
	add("{\"term\":\"clotheshorse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10010564\", \"03055026\"]}");
	add("{\"term\":\"clothesline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03055137\"]}");
	add("{\"term\":\"clothespin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03055234\"]}");
	add("{\"term\":\"clothespress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03054531\"]}");
	add("{\"term\":\"clothier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09950230\"]}");
	add("{\"term\":\"clothing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03055525\"]}");
	add("{\"term\":\"clotho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09588632\"]}");
	add("{\"term\":\"clotting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13475652\"]}");
	add("{\"term\":\"cloture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06679574\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }