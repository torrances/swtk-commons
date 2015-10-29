package org.swtk.commons.dict.wordnet.indexbyname.instance.k.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKRA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"k ration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07581657\"]}");
	add("{\"term\":\"kraal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03633712\", \"08690869\"]}");
	add("{\"term\":\"kraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14903131\"]}");
	add("{\"term\":\"kraft paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14903131\"]}");
	add("{\"term\":\"krait\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01753677\"]}");
	add("{\"term\":\"krakatao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09198812\"]}");
	add("{\"term\":\"krakatau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09198812\"]}");
	add("{\"term\":\"krakatoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09198812\"]}");
	add("{\"term\":\"krakau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09005783\"]}");
	add("{\"term\":\"krakow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09005783\"]}");
	add("{\"term\":\"krasner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11130386\"]}");
	add("{\"term\":\"kraurosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14594958\"]}");
	add("{\"term\":\"kraurosis vulvae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14595085\"]}");
	add("{\"term\":\"kraut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09767570\"]}");
	add("{\"term\":\"krauthead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09767570\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }