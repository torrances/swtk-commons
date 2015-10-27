package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tragacanth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15101793\"]}");
	add("{\"term\":\"tragedian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10741261\", \"10741357\"]}");
	add("{\"term\":\"tragedienne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10741468\"]}");
	add("{\"term\":\"tragedy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07030062\", \"07329438\"]}");
	add("{\"term\":\"tragelaphus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02426433\"]}");
	add("{\"term\":\"tragicomedy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07029911\", \"07030275\"]}");
	add("{\"term\":\"tragopan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01809746\"]}");
	add("{\"term\":\"tragopogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12047233\"]}");
	add("{\"term\":\"tragulidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02438320\"]}");
	add("{\"term\":\"tragulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02438698\"]}");
	add("{\"term\":\"tragus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05331682\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }