package org.swtk.commons.dict.wordnet.index.name.instance.c.i.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCINC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cinch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00499438\", \"03035741\", \"00576402\"]}");
	add("{\"term\":\"cinchona\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12684565\", \"12685471\"]}");
	add("{\"term\":\"cinchonine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737502\"]}");
	add("{\"term\":\"cincinnati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09153563\"]}");
	add("{\"term\":\"cincinnatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10918060\"]}");
	add("{\"term\":\"cinclidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01604191\"]}");
	add("{\"term\":\"cinclus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01604560\"]}");
	add("{\"term\":\"cincture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442981\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }