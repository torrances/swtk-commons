package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hauberk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03504612\"]}");
	add("{\"term\":\"haughtiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04895107\"]}");
	add("{\"term\":\"haul\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13777962\", \"00115856\"]}");
	add("{\"term\":\"haulage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00115856\"]}");
	add("{\"term\":\"hauler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10182100\"]}");
	add("{\"term\":\"haulier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10182100\"]}");
	add("{\"term\":\"hauling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01107814\"]}");
	add("{\"term\":\"haulm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13184547\"]}");
	add("{\"term\":\"haunch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02466441\", \"05564105\"]}");
	add("{\"term\":\"haunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08599031\"]}");
	add("{\"term\":\"hausa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06995357\", \"09744414\"]}");
	add("{\"term\":\"hausen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02643487\"]}");
	add("{\"term\":\"hausmannite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14702229\"]}");
	add("{\"term\":\"haussa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06995357\", \"09744414\"]}");
	add("{\"term\":\"haustorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11706518\"]}");
	add("{\"term\":\"hautbois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03844419\"]}");
	add("{\"term\":\"hautboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03844419\"]}");
	add("{\"term\":\"hauteur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04895107\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }