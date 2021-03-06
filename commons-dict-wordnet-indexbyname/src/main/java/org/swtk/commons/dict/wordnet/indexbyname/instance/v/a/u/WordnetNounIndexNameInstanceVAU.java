package org.swtk.commons.dict.wordnet.indexbyname.instance.v.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vaudeville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07033537\"]}");
	add("{\"term\":\"vaudeville theater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03807073\"]}");
	add("{\"term\":\"vaudeville theatre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03807073\"]}");
	add("{\"term\":\"vaudevillian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766467\"]}");
	add("{\"term\":\"vaudois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08167899\"]}");
	add("{\"term\":\"vaughan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381418\"]}");
	add("{\"term\":\"vaughan williams\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381580\"]}");
	add("{\"term\":\"vault\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00121335\", \"04530820\", \"04531126\", \"04530985\"]}");
	add("{\"term\":\"vault of heaven\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08538450\"]}");
	add("{\"term\":\"vaulter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766599\"]}");
	add("{\"term\":\"vaulting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00289034\", \"04531288\"]}");
	add("{\"term\":\"vaulting horse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04531437\"]}");
	add("{\"term\":\"vaunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07244887\"]}");
	add("{\"term\":\"vaunter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09891532\"]}");
	add("{\"term\":\"vaux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381752\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }