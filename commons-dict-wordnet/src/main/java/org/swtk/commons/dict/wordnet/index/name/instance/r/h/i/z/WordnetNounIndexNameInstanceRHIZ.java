package org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRHIZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rhizobiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01356790\"]}");
	add("{\"term\":\"rhizobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01356965\"]}");
	add("{\"term\":\"rhizoctinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13103328\"]}");
	add("{\"term\":\"rhizoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12995586\"]}");
	add("{\"term\":\"rhizome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13149341\"]}");
	add("{\"term\":\"rhizomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13252196\"]}");
	add("{\"term\":\"rhizophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12366226\"]}");
	add("{\"term\":\"rhizophoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12366012\"]}");
	add("{\"term\":\"rhizopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394032\"]}");
	add("{\"term\":\"rhizopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01393815\"]}");
	add("{\"term\":\"rhizopodan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394032\"]}");
	add("{\"term\":\"rhizopogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12992384\"]}");
	add("{\"term\":\"rhizopogonaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991917\"]}");
	add("{\"term\":\"rhizopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12994551\"]}");
	add("{\"term\":\"rhizotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00692583\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }