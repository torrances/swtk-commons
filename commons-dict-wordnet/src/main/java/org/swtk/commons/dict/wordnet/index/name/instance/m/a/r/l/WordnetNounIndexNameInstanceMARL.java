package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"marl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14705410\"]}");
	add("{\"term\":\"marlberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12118073\"]}");
	add("{\"term\":\"marley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11177570\"]}");
	add("{\"term\":\"marlin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02633671\"]}");
	add("{\"term\":\"marline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03728043\"]}");
	add("{\"term\":\"marlinespike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03728137\"]}");
	add("{\"term\":\"marlingspike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03728137\"]}");
	add("{\"term\":\"marlinspike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03728137\"]}");
	add("{\"term\":\"marlite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14722729\"]}");
	add("{\"term\":\"marlowe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09624745\", \"11177709\"]}");
	add("{\"term\":\"marlstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14722729\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }