package org.swtk.commons.dict.wordnet.indexbyname.instance.m.y.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"myth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06384303\"]}");
	add("{\"term\":\"mythical being\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09507794\"]}");
	add("{\"term\":\"mythical creature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09515254\"]}");
	add("{\"term\":\"mythical monster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09515254\"]}");
	add("{\"term\":\"mythical place\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05633662\"]}");
	add("{\"term\":\"mythologisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06782029\"]}");
	add("{\"term\":\"mythologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10363600\"]}");
	add("{\"term\":\"mythologization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06782029\"]}");
	add("{\"term\":\"mythology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06157324\", \"07994846\"]}");
	add("{\"term\":\"mytilene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801435\"]}");
	add("{\"term\":\"mytilid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01966690\"]}");
	add("{\"term\":\"mytilidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01966371\"]}");
	add("{\"term\":\"mytilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01966517\"]}");
	add("{\"term\":\"mytilus edulis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01966912\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }