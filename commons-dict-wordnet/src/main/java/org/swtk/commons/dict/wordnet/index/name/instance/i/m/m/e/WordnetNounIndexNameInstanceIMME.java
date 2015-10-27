package org.swtk.commons.dict.wordnet.index.name.instance.i.m.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIMME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"immediacy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05066676\", \"05716269\", \"04925944\"]}");
	add("{\"term\":\"immediateness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04925944\", \"05066676\"]}");
	add("{\"term\":\"immenseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05111848\"]}");
	add("{\"term\":\"immensity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05111848\"]}");
	add("{\"term\":\"immersion\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00278413\", \"01040517\", \"05712213\", \"07336941\", \"07378715\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }