package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07464148\", \"12418369\", \"00120830\"]}");
	add("{\"term\":\"hope\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04855493\", \"11079258\", \"10204565\", \"05959600\", \"07556441\", \"07526972\"]}");
	add("{\"term\":\"hopeful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820956\"]}");
	add("{\"term\":\"hopefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07556704\", \"14507204\"]}");
	add("{\"term\":\"hopeh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743759\"]}");
	add("{\"term\":\"hopei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743759\"]}");
	add("{\"term\":\"hopelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07557637\"]}");
	add("{\"term\":\"hoper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10204767\"]}");
	add("{\"term\":\"hopi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06927807\", \"09676252\"]}");
	add("{\"term\":\"hopkins\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11079433\", \"11079588\", \"11079767\", \"11079870\", \"11080098\"]}");
	add("{\"term\":\"hopkinson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11080236\"]}");
	add("{\"term\":\"hopper\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00129909\", \"02229081\", \"03540609\", \"10204946\", \"03540464\"]}");
	add("{\"term\":\"hops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12418369\"]}");
	add("{\"term\":\"hopsack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03540827\"]}");
	add("{\"term\":\"hopsacking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03540827\"]}");
	add("{\"term\":\"hopscotch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00486092\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }