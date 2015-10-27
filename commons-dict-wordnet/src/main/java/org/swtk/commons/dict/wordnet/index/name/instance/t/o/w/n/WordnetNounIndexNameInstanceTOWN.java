package org.swtk.commons.dict.wordnet.index.name.instance.t.o.w.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOWN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"town\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11366705\", \"08689937\", \"08243435\", \"08683242\"]}");
	add("{\"term\":\"townee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10739044\"]}");
	add("{\"term\":\"towner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10738916\"]}");
	add("{\"term\":\"townes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11366868\"]}");
	add("{\"term\":\"townie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10739222\"]}");
	add("{\"term\":\"townsend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11367075\"]}");
	add("{\"term\":\"townsendia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12046775\"]}");
	add("{\"term\":\"townsfolk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08243435\"]}");
	add("{\"term\":\"township\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08689937\"]}");
	add("{\"term\":\"townsman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10738916\", \"10739341\"]}");
	add("{\"term\":\"townspeople\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08243435\"]}");
	add("{\"term\":\"towny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10739222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }