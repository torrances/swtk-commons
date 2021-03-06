package org.swtk.commons.dict.wordnet.indexbyname.instance.e.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eudaemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09565826\"]}");
	add("{\"term\":\"eudaemonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14470991\"]}");
	add("{\"term\":\"eudaimonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14470991\"]}");
	add("{\"term\":\"eudemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09565826\"]}");
	add("{\"term\":\"eudemonism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06170134\"]}");
	add("{\"term\":\"euderma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02151029\"]}");
	add("{\"term\":\"euderma maculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02151164\"]}");
	add("{\"term\":\"eudiometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03306334\"]}");
	add("{\"term\":\"eudora welty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11401452\"]}");
	add("{\"term\":\"eudromias morinellus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026839\"]}");
	add("{\"term\":\"eudyptes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02059862\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }