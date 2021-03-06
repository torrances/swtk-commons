package org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"won\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13731097\", \"13731465\"]}");
	add("{\"term\":\"won ton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07603764\", \"07717802\"]}");
	add("{\"term\":\"wonder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05690411\", \"07304311\", \"07525235\"]}");
	add("{\"term\":\"wonder bean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12531744\"]}");
	add("{\"term\":\"wonder boy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10809055\"]}");
	add("{\"term\":\"wonder child\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938325\"]}");
	add("{\"term\":\"wonder flower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12480813\"]}");
	add("{\"term\":\"wonder woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10809460\"]}");
	add("{\"term\":\"wonderberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12917375\"]}");
	add("{\"term\":\"wonderer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10809174\", \"10809349\"]}");
	add("{\"term\":\"wonderfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04736385\"]}");
	add("{\"term\":\"wonderland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05639958\", \"09503829\"]}");
	add("{\"term\":\"wonderment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07525235\"]}");
	add("{\"term\":\"wonk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704113\"]}");
	add("{\"term\":\"wont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05676878\"]}");
	add("{\"term\":\"wonton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07603764\", \"07717802\"]}");
	add("{\"term\":\"wonton soup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07603764\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }