package org.swtk.commons.dict.wordnet.index.name.instance.b.e.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"beet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07735584\", \"11852683\"]}");
	add("{\"term\":\"beethoven\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07292719\", \"10861001\"]}");
	add("{\"term\":\"beetle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03720925\", \"02167116\"]}");
	add("{\"term\":\"beetleweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12271795\"]}");
	add("{\"term\":\"beetroot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07735584\", \"11852949\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }