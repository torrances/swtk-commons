package org.swtk.commons.dict.wordnet.index.name.instance.p.u.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUSH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"push\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00283329\", \"04033499\", \"04843914\", \"11518603\", \"00113132\"]}");
	add("{\"term\":\"pushan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09551058\"]}");
	add("{\"term\":\"pushball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00478838\"]}");
	add("{\"term\":\"pushcart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03489166\"]}");
	add("{\"term\":\"pushchair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02769539\"]}");
	add("{\"term\":\"pusher\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02769539\", \"04034182\", \"10515006\", \"10515140\", \"10515341\"]}");
	add("{\"term\":\"pushiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05174939\"]}");
	add("{\"term\":\"pushing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00113132\"]}");
	add("{\"term\":\"pushkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11269181\"]}");
	add("{\"term\":\"pushover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00576402\", \"10515465\"]}");
	add("{\"term\":\"pushpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04438879\"]}");
	add("{\"term\":\"pushtun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09709135\"]}");
	add("{\"term\":\"pushup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00630558\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }