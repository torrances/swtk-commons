package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cortaderia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12135498\"]}");
	add("{\"term\":\"cortef\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776881\"]}");
	add("{\"term\":\"cortege\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08446124\", \"08446439\"]}");
	add("{\"term\":\"cortes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10931995\"]}");
	add("{\"term\":\"cortex\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05328184\", \"05498230\", \"05494162\"]}");
	add("{\"term\":\"cortez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10931995\"]}");
	add("{\"term\":\"corticium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13035989\"]}");
	add("{\"term\":\"corticoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14775596\"]}");
	add("{\"term\":\"corticosteroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14775596\"]}");
	add("{\"term\":\"corticosterone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14770070\"]}");
	add("{\"term\":\"corticotrophin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415456\"]}");
	add("{\"term\":\"corticotropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415456\"]}");
	add("{\"term\":\"cortina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13094739\"]}");
	add("{\"term\":\"cortinariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13094844\"]}");
	add("{\"term\":\"cortinarius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13095037\"]}");
	add("{\"term\":\"cortisol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776881\"]}");
	add("{\"term\":\"cortisone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777131\"]}");
	add("{\"term\":\"cortland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07756009\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }