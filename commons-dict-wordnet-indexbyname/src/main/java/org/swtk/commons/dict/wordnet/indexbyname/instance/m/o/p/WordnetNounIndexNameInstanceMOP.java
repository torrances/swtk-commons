package org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04374567\"]}");
	add("{\"term\":\"mop handle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03790675\"]}");
	add("{\"term\":\"mop up\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00211959\"]}");
	add("{\"term\":\"mopboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02803513\"]}");
	add("{\"term\":\"mope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10008241\"]}");
	add("{\"term\":\"moped\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03790549\"]}");
	add("{\"term\":\"mopes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14428465\"]}");
	add("{\"term\":\"mopper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10350435\"]}");
	add("{\"term\":\"moppet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10350548\"]}");
	add("{\"term\":\"mopping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00252887\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }