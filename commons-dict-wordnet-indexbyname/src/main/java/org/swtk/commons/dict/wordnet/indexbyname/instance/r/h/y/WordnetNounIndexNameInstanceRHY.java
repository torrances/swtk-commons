package org.swtk.commons.dict.wordnet.indexbyname.instance.r.h.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRHY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rhyacotriton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01637984\"]}");
	add("{\"term\":\"rhyme\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06393492\", \"07111327\"]}");
	add("{\"term\":\"rhymer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10548068\"]}");
	add("{\"term\":\"rhymester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10548068\"]}");
	add("{\"term\":\"rhynchocephalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01675591\"]}");
	add("{\"term\":\"rhynchoelaps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01749785\"]}");
	add("{\"term\":\"rhyncostylis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12101989\"]}");
	add("{\"term\":\"rhynia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13239179\"]}");
	add("{\"term\":\"rhyniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13239012\"]}");
	add("{\"term\":\"rhyolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14957374\"]}");
	add("{\"term\":\"rhythm\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00854775\", \"07100515\", \"15313066\", \"04775267\", \"07100710\"]}");
	add("{\"term\":\"rhythmicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04998633\"]}");
	add("{\"term\":\"rhytidectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00675401\"]}");
	add("{\"term\":\"rhytidoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00675401\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }