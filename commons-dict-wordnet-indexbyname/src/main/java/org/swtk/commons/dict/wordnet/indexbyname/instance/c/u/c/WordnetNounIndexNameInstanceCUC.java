package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cuckold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10001682\"]}");
	add("{\"term\":\"cuckoldom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13990057\"]}");
	add("{\"term\":\"cuckoldry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00161742\"]}");
	add("{\"term\":\"cuckoo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01825654\", \"10177319\"]}");
	add("{\"term\":\"cuckooflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902543\"]}");
	add("{\"term\":\"cuckoopint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11800617\"]}");
	add("{\"term\":\"cuculidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825414\"]}");
	add("{\"term\":\"cuculiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825064\"]}");
	add("{\"term\":\"cuculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825920\"]}");
	add("{\"term\":\"cucumber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07734217\", \"12185901\"]}");
	add("{\"term\":\"cucumis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12184732\"]}");
	add("{\"term\":\"cucurbit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178194\"]}");
	add("{\"term\":\"cucurbita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178665\"]}");
	add("{\"term\":\"cucurbitaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12177793\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }