package org.swtk.commons.dict.wordnet.index.name.instance.t.u.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tumble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00077704\", \"00438728\"]}");
	add("{\"term\":\"tumblebug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02175330\"]}");
	add("{\"term\":\"tumbler\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01817396\", \"04504300\", \"04504167\", \"10752624\"]}");
	add("{\"term\":\"tumbleweed\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11843905\", \"11853842\", \"11855359\", \"12575416\"]}");
	add("{\"term\":\"tumbling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00435015\"]}");
	add("{\"term\":\"tumbrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04504544\"]}");
	add("{\"term\":\"tumbril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04504544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }