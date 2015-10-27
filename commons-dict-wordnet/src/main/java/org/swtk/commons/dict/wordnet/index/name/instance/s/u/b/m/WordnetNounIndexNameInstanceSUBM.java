package org.swtk.commons.dict.wordnet.index.name.instance.s.u.b.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUBM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"submarine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07713570\", \"04354832\"]}");
	add("{\"term\":\"submariner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10688796\"]}");
	add("{\"term\":\"submaxilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05283404\"]}");
	add("{\"term\":\"submediant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06871434\"]}");
	add("{\"term\":\"submenu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06505712\"]}");
	add("{\"term\":\"submergence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07378715\"]}");
	add("{\"term\":\"submerging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07378715\"]}");
	add("{\"term\":\"submersible\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04355262\", \"04355437\"]}");
	add("{\"term\":\"submersion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00278413\", \"07378715\"]}");
	add("{\"term\":\"submission\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06744259\", \"06784758\", \"06784895\", \"07524564\", \"14603635\", \"01169416\", \"07182229\"]}");
	add("{\"term\":\"submissiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04913648\"]}");
	add("{\"term\":\"submitter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10688925\", \"10689166\"]}");
	add("{\"term\":\"submucosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05437571\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }