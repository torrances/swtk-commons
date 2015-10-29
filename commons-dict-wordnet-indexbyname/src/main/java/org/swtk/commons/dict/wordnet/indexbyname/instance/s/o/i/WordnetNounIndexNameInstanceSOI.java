package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soil\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08510074\", \"09358146\", \"14868863\", \"14521680\"]}");
	add("{\"term\":\"soil bank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13390455\"]}");
	add("{\"term\":\"soil conditioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14869553\"]}");
	add("{\"term\":\"soil conservation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00821302\"]}");
	add("{\"term\":\"soil erosion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13579206\"]}");
	add("{\"term\":\"soil horizon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08675940\"]}");
	add("{\"term\":\"soil pipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04264794\"]}");
	add("{\"term\":\"soil profile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08566180\"]}");
	add("{\"term\":\"soiling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00277464\"]}");
	add("{\"term\":\"soilure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00277464\"]}");
	add("{\"term\":\"soiree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08272152\"]}");
	add("{\"term\":\"soiree musicale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08272294\"]}");
	add("{\"term\":\"soissons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01297282\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }