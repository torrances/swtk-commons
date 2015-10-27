package org.swtk.commons.dict.wordnet.index.name.instance.l.i.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lime\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07765707\", \"12223453\", \"12732744\", \"14726864\", \"14814055\", \"14960148\"]}");
	add("{\"term\":\"limeade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07942586\"]}");
	add("{\"term\":\"limeira\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08874901\"]}");
	add("{\"term\":\"limekiln\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03674860\"]}");
	add("{\"term\":\"limelight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03674991\", \"14457235\"]}");
	add("{\"term\":\"limen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720373\"]}");
	add("{\"term\":\"limenitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02279179\"]}");
	add("{\"term\":\"limerick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06392226\", \"08909884\"]}");
	add("{\"term\":\"limestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14960364\"]}");
	add("{\"term\":\"limewater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14961231\"]}");
	add("{\"term\":\"limey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09722881\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }