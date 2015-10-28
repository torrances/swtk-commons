package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rudapithecus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02480870\"]}");
	add("{\"term\":\"rudbeckia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12028486\"]}");
	add("{\"term\":\"rudd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01445351\"]}");
	add("{\"term\":\"rudder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04124310\", \"04124558\"]}");
	add("{\"term\":\"rudderfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02581722\", \"02607110\"]}");
	add("{\"term\":\"rudderpost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04124841\"]}");
	add("{\"term\":\"rudderstock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04124841\"]}");
	add("{\"term\":\"ruddiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04984679\"]}");
	add("{\"term\":\"ruddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15032854\"]}");
	add("{\"term\":\"ruddles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11964129\"]}");
	add("{\"term\":\"rudeness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14496208\", \"04921469\"]}");
	add("{\"term\":\"rudiment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05611777\"]}");
	add("{\"term\":\"rudiments\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05881364\", \"06652212\"]}");
	add("{\"term\":\"rudra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09551371\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }